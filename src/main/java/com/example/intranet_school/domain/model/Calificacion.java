package com.example.intranet_school.domain.model;

import java.time.LocalDateTime;

public class Calificacion {
    private Long id;
    private Estudiante estudiante;
    private Curso curso;
    private Tarea tarea;
    private Double valor;
    private Tipo tipo;
    private LocalDateTime fecha;
    private String observaciones;
    private Profesor profesor;

    public Calificacion() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public Tarea getTarea() { return tarea; }
    public void setTarea(Tarea tarea) { this.tarea = tarea; }
    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }
    public Tipo getTipo() { return tipo; }
    public void setTipo(Tipo tipo) { this.tipo = tipo; }
    public LocalDateTime getFecha() { return fecha; }
    public void setFecha(LocalDateTime fecha) { this.fecha = fecha; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }

    public enum Tipo {
        EXAMEN, TAREA, PARTICIPACION, PROYECTO
    }
}