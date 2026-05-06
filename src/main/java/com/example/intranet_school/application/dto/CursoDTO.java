package com.example.intranet_school.application.dto;

import com.example.intranet_school.domain.model.Estudiante.NivelEducativo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CursoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private NivelEducativo nivel;
    private Integer grado;
    private String seccion;
    private Long profesorId;
    private String profesorNombre;
    private Integer año;
}