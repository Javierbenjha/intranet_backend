package com.example.intranet_school.domain.model;

public class Matricula {
    private Long id;
    private Estudiante estudiante;
    private Curso curso;
    private Integer año;
    private Estado estado;

    public Matricula() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Estudiante getEstudiante() { return estudiante; }
    public void setEstudiante(Estudiante estudiante) { this.estudiante = estudiante; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public Integer getAño() { return año; }
    public void setAño(Integer año) { this.año = año; }
    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    public enum Estado {
        ACTIVA, INACTIVA, FINALIZADA
    }
}