package com.example.intranet_school.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matriculas")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatriculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private CursoEntity curso;
    private Integer año;
    @Enumerated(EnumType.STRING)
    private Estado estado;
    public enum Estado { ACTIVA, INACTIVA, FINALIZADA }
}
