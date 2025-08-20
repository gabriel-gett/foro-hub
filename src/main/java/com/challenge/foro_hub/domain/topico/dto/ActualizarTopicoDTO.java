package com.challenge.foro_hub.domain.topico.dto;


import com.challenge.foro_hub.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
