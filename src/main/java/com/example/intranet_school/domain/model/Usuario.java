package com.example.intranet_school.domain.model;

import java.time.LocalDateTime;

public class Usuario {
    private Long id;
    private String email;
    private String password;
    private String nombre;
    private String apellido;
    private Rol rol;
    private String avatar;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Usuario() {}

    public Usuario(Long id, String email, String password, String nombre, String apellido, Rol rol, String avatar) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.avatar = avatar;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public Rol getRol() { return rol; }
    public void setRol(Rol rol) { this.rol = rol; }
    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }

    public enum Rol {
        DIRECTOR, PROFESOR, ESTUDIANTE
    }
}