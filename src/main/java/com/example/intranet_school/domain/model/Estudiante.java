package com.example.intranet_school.domain.model;

import java.time.LocalDate;

public class Estudiante {
    private Long id;
    private Usuario usuario;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private Integer grado;
    private String seccion;
    private NivelEducativo nivel;

    public Estudiante() {}

    public Estudiante(Long id, Usuario usuario, LocalDate fechaNacimiento, String direccion, String telefono, Integer grado, String seccion, NivelEducativo nivel) {
        this.id = id;
        this.usuario = usuario;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.grado = grado;
        this.seccion = seccion;
        this.nivel = nivel;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(LocalDate fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public Integer getGrado() { return grado; }
    public void setGrado(Integer grado) { this.grado = grado; }
    public String getSeccion() { return seccion; }
    public void setSeccion(String seccion) { this.seccion = seccion; }
    public NivelEducativo getNivel() { return nivel; }
    public void setNivel(NivelEducativo nivel) { this.nivel = nivel; }

    public enum NivelEducativo {
        INICIAL, PRIMARIA, SECUNDARIA
    }
}