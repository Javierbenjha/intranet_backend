package com.example.intranet_school.domain.model;

public class Curso {
    private Long id;
    private String nombre;
    private String descripcion;
    private Estudiante.NivelEducativo nivel;
    private Integer grado;
    private String seccion;
    private Profesor profesor;
    private Integer año;

    public Curso() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Estudiante.NivelEducativo getNivel() { return nivel; }
    public void setNivel(Estudiante.NivelEducativo nivel) { this.nivel = nivel; }
    public Integer getGrado() { return grado; }
    public void setGrado(Integer grado) { this.grado = grado; }
    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }
    public Profesor getProfesor() { return profesor; }
    public void setProfesor(Profesor profesor) { this.profesor = profesor; }
    public Integer getAño() { return año; }
    public void setAño(Integer año) { this.año = año; }
}