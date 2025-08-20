package com.challenge.foro_hub.domain.usuario.dto;


import com.challenge.foro_hub.domain.usuario.Role;

public record ActualizarUsuarioDTO(
        String password,
        Role role,
        String nombre,
        String apellido,
        String email,
        Boolean enabled
) {
}
