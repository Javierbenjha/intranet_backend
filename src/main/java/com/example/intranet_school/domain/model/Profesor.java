package com.example.intranet_school.domain.model;

public class Profesor {
    private Long id;
    private Usuario usuario;
    private String especialidad;
    private String telefono;

    public Profesor() {}

    public Profesor(Long id, Usuario usuario, String especialidad, String telefono) {
        this.id = id;
        this.usuario = usuario;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}