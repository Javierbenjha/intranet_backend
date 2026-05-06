package com.example.intranet_school.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "calificaciones")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CalificacionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private CursoEntity curso;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tarea_id")
    private TareaEntity tarea;
    @Column(nullable = false)
    private Double valor;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Tipo tipo;
    private LocalDateTime fecha;
    private String observaciones;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profesor_id", nullable = false)
    private ProfesorEntity profesor;
    public enum Tipo { EXAMEN, TAREA, PARTICIPACION, PROYECTO }
}
