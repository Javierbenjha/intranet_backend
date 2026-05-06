package com.example.intranet_school.domain.ports.out;

import com.example.intranet_school.domain.model.Tarea;

import java.util.List;

public interface TareaRepositoryPort {
    List<Tarea> findAll();
    List<Tarea> findByCursoId(Long cursoId);
    Tarea save(Tarea tarea);
    void deleteById(Long id);
}
