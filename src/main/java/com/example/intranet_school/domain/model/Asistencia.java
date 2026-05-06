package com.example.intranet_school.domain.model;

import java.time.LocalDate;

public class Asistencia {
    private Long id;
    private Estudiante estudiante;
    private Curso curso;
    private LocalDate fecha;
    private Boolean presente;
    private String observaciones;

    public Asistencia() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public Boolean getPresente() { return presente; }
    public void setPresente(Boolean presente) { this.presente = presente; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
}