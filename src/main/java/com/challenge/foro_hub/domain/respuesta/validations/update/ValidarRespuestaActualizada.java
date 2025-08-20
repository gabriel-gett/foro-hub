package com.challenge.foro_hub.domain.respuesta.validations.update;


import com.challenge.foro_hub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
