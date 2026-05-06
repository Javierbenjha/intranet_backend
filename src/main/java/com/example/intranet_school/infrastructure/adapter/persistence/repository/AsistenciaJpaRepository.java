package com.example.intranet_school.infrastructure.adapter.persistence.repository;

import com.example.intranet_school.infrastructure.adapter.persistence.entity.AsistenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.List;

public interface AsistenciaJpaRepository extends JpaRepository<AsistenciaEntity, Long> {
    List<AsistenciaEntity> findByEstudianteId(Long estudianteId);
    List<AsistenciaEntity> findByCursoId(Long cursoId);
    List<AsistenciaEntity> findByFecha(LocalDate fecha);
}
