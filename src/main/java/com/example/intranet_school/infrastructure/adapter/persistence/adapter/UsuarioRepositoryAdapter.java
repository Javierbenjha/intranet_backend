package com.example.intranet_school.infrastructure.adapter.persistence.adapter;

import com.example.intranet_school.domain.model.Usuario;
import com.example.intranet_school.domain.ports.out.UsuarioRepositoryPort;
import com.example.intranet_school.infrastructure.adapter.persistence.mapper.UsuarioMapper;
import com.example.intranet_school.infrastructure.adapter.persistence.repository.UsuarioJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {
    private final UsuarioJpaRepository jpaRepository;
    private final UsuarioMapper mapper;

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return jpaRepository.findByEmail(email).map(mapper::toDomain);
    }

    @Override
    public boolean existsByEmail(String email) {
        return jpaRepository.existsByEmail(email);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return mapper.toDomain(jpaRepository.save(mapper.toEntity(usuario)));
    }

    @Override
    public Optional<Usuario> findById(Long id) {
        return jpaRepository.findById(id).map(mapper::toDomain);
    }
}