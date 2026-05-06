package com.example.intranet_school.domain.model;

import java.time.LocalDateTime;

public class Pago {
    private Long id;
    private Estudiante estudiante;
    private Double monto;
    private String concepto;
    private LocalDateTime fechaPago;
    private Estado estado;
    private String metodoPago;

    public Pago() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }
    public String getConcepto() { return concepto; }
    public void setConcepto(String concepto) { this.concepto = concepto; }
    public LocalDateTime getFechaPago() { return fechaPago; }
    public void setFechaPago(LocalDateTime fechaPago) { this.fechaPago = fechaPago; }
    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }
    public String getMetodoPago() { return metodoPago; }
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }

    public enum Estado {
        PENDIENTE, PAGADO, VENCIDO
    }
}