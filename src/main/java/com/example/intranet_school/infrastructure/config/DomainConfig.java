package com.example.intranet_school.infrastructure.config;

import com.example.intranet_school.domain.ports.in.AuthUseCase;
import com.example.intranet_school.domain.ports.out.JwtPort;
import com.example.intranet_school.domain.ports.out.PasswordEncryptorPort;
import com.example.intranet_school.domain.ports.out.UsuarioRepositoryPort;
import com.example.intranet_school.domain.service.AuthServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomainConfig {

    @Bean
    public AuthUseCase authUseCase(UsuarioRepositoryPort usuarioRepositoryPort,
                                   JwtPort jwtPort,
                                   PasswordEncryptorPort passwordEncryptorPort) {
        return new AuthServiceImpl(usuarioRepositoryPort, jwtPort, passwordEncryptorPort);
    }
}
