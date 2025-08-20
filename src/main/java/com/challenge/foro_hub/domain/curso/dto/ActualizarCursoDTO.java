package com.challenge.foro_hub.domain.curso.dto;


import com.challenge.foro_hub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}