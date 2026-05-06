package com.example.intranet_school.infrastructure.adapter.persistence.repository;

import com.example.intranet_school.infrastructure.adapter.persistence.entity.HorarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface HorarioJpaRepository extends JpaRepository<HorarioEntity, Long> {
    List<HorarioEntity> findByCursoId(Long cursoId);
    List<HorarioEntity> findByDia(Integer dia);
}
