package com.challenge.foro_hub.domain.usuario.validations.update;

import com.desafio.forohub.domain.usuario.dto.ActualizarUsuarioDTO;

public interface ValidarActualizarUsuario {
    void validate(ActualizarUsuarioDTO data);
}
