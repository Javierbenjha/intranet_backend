package com.example.intranet_school.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PagoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private EstudianteEntity estudiante;
    @Column(nullable = false)
    private Double monto;
    private String concepto;
    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Estado estado;
    private String metodoPago;
    public enum Estado { PENDIENTE, PAGADO, VENCIDO }
}
