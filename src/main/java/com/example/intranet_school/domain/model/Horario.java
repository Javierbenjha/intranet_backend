package com.example.intranet_school.domain.model;

public class Horario {
    private Long id;
    private Curso curso;
    private Integer dia;
    private String horaInicio;
    private String horaFin;
    private String salon;

    public Horario() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }
    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }
    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }
    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }
    public String getSalon() { return salon; }
    public void setSalon(String salon) { this.salon = salon; }
}