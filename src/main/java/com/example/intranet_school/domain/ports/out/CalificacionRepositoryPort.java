package com.example.intranet_school.domain.ports.out;

import com.example.intranet_school.domain.model.*;
import java.util.List;

public interface CalificacionRepositoryPort {
    List<Calificacion> findAll();
    List<Calificacion> findByEstudianteId(Long estudianteId);
    List<Calificacion> findByCursoId(Long cursoId);
    List<Calificacion> findByProfesorId(Long profesorId);
    Calificacion save(Calificacion calificacion);
    void deleteById(Long id);
}

