package com.example.intranet_school.domain.ports.out;

import com.example.intranet_school.domain.model.Horario;

import java.util.List;

public interface HorarioRepositoryPort {
    List<Horario> findAll();
    List<Horario> findByCursoId(Long cursoId);
    List<Horario> findByDia(Integer dia);
    Horario save(Horario horario);
    void deleteById(Long id);
}
