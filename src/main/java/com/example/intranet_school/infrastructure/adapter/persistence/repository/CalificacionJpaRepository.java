package com.example.intranet_school.infrastructure.adapter.persistence.repository;

import com.example.intranet_school.infrastructure.adapter.persistence.entity.CalificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CalificacionJpaRepository extends JpaRepository<CalificacionEntity, Long> {
    List<CalificacionEntity> findByEstudianteId(Long estudianteId);
    List<CalificacionEntity> findByCursoId(Long cursoId);
    List<CalificacionEntity> findByProfesorId(Long profesorId);
}
