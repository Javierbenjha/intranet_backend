package com.example.intranet_school.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "horarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HorarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id", nullable = false)
    private CursoEntity curso;
    @Column(nullable = false)
    private Integer dia;
    @Column(name = "hora_inicio", nullable = false)
    private String horaInicio;
    @Column(name = "hora_fin", nullable = false)
    private String horaFin;
    private String salon;
}
