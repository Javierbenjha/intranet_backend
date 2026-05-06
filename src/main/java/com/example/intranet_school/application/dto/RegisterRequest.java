package com.example.intranet_school.application.dto;

import com.example.intranet_school.domain.model.Usuario.Rol;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotNull
    private Rol rol;
}