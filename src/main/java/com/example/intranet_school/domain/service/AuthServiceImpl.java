package com.example.intranet_school.domain.service;

import com.example.intranet_school.application.dto.*;
import com.example.intranet_school.domain.model.Usuario;
import com.example.intranet_school.domain.ports.in.AuthUseCase;
import com.example.intranet_school.domain.ports.out.JwtPort;
import com.example.intranet_school.domain.ports.out.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import com.example.intranet_school.domain.ports.out.PasswordEncryptorPort;
import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class AuthServiceImpl implements AuthUseCase {
    private final UsuarioRepositoryPort usuarioRepositoryPort;
    private final JwtPort jwtPort;
    private final PasswordEncryptorPort passwordEncryptorPort;

    @Override
    public AuthResponse login(LoginRequest request) {
        Usuario usuario = usuarioRepositoryPort.findByEmail(request.getEmail()).orElse(null);

        if (usuario == null || !passwordEncryptorPort.matches(request.getPassword(), usuario.getPassword())) {
            return AuthResponse.builder().success(false).message("Credenciales inválidas").build();
        }

        String token = jwtPort.generateToken(usuario);
        UsuarioDTO userDTO = toUsuarioDTO(usuario);

        return AuthResponse.builder().success(true).token(token).user(userDTO).build();
    }

    @Override
    public AuthResponse register(RegisterRequest request) {
        if (usuarioRepositoryPort.existsByEmail(request.getEmail())) {
            return AuthResponse.builder().success(false).message("El correo ya está registrado").build();
        }

        Usuario usuario = new Usuario();
        usuario.setEmail(request.getEmail());
        usuario.setPassword(passwordEncryptorPort.encode(request.getPassword()));
        usuario.setNombre(request.getNombre());
        usuario.setApellido(request.getApellido());
        usuario.setRol(request.getRol());
        usuario.setAvatar("https://ui-avatars.com/api/?name=" + request.getNombre() + "+" + request.getApellido() + "&background=random");

        usuario = usuarioRepositoryPort.save(usuario);

        String token = jwtPort.generateToken(usuario);
        UsuarioDTO userDTO = toUsuarioDTO(usuario);

        return AuthResponse.builder().success(true).token(token).user(userDTO).build();
    }

    @Override
    public Map<String, Object> getDashboardData(String role, Long userId) {
        Map<String, Object> data = new HashMap<>();
        
        switch (role) {
            case "DIRECTOR":
                data.put("totalEstudiantes", 150);
                data.put("totalProfesores", 20);
                data.put("totalCursos", 25);
                data.put("pagosPendientes", 15);
                break;
            case "PROFESOR":
                data.put("misCursos", 5);
                data.put("misTareas", 12);
                data.put("misAlumnos", 80);
                break;
            case "ESTUDIANTE":
                data.put("misCursos", 6);
                data.put("misTareas", 8);
                data.put("misNotas", 24);
                break;
        }
        return data;
    }

    private UsuarioDTO toUsuarioDTO(Usuario usuario) {
        return UsuarioDTO.builder()
                .id(usuario.getId())
                .email(usuario.getEmail())
                .nombre(usuario.getNombre())
                .apellido(usuario.getApellido())
                .rol(usuario.getRol())
                .avatar(usuario.getAvatar())
                .build();
    }
}