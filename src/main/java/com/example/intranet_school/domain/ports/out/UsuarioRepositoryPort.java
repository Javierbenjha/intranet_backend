package com.example.intranet_school.domain.ports.out;

import com.example.intranet_school.domain.model.Usuario;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Optional<Usuario> findByEmail(String email);
    boolean existsByEmail(String email);
    Usuario save(Usuario usuario);
    Optional<Usuario> findById(Long id);
}