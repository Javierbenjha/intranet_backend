package com.example.intranet_school.infrastructure.adapter.persistence.repository;

import com.example.intranet_school.infrastructure.adapter.persistence.entity.TareaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TareaJpaRepository extends JpaRepository<TareaEntity, Long> {
    List<TareaEntity> findByCursoId(Long cursoId);
}
