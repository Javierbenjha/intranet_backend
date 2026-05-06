package com.example.intranet_school.infrastructure.adapter.persistence.repository;

import com.example.intranet_school.infrastructure.adapter.persistence.entity.CursoEntity;
import com.example.intranet_school.infrastructure.adapter.persistence.entity.EstudianteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CursoJpaRepository extends JpaRepository<CursoEntity, Long> {
    List<CursoEntity> findByProfesorId(Long profesorId);
    List<CursoEntity> findByNivelAndGrado(EstudianteEntity.NivelEducativo nivel, Integer grado);
    List<CursoEntity> findByAño(Integer año);
}