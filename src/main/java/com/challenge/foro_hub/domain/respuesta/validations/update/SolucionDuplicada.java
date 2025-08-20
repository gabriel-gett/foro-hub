package com.challenge.foro_hub.domain.respuesta.validations.update;


import com.challenge.foro_hub.domain.respuesta.Respuesta;
import com.challenge.foro_hub.domain.respuesta.dto.ActualizarRespuestaDTO;
import com.challenge.foro_hub.domain.respuesta.repository.RespuestaRepository;
import com.challenge.foro_hub.domain.topico.Estado;
import com.challenge.foro_hub.domain.topico.repository.TopicoRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SolucionDuplicada implements ValidarRespuestaActualizada {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @Autowired
    private TopicoRepository topicoRepository;

    @Override
    public void validate(ActualizarRespuestaDTO data, Long respuestaId) {
        if (data.solucion()){
            Respuesta respuesta = respuestaRepository.getReferenceById(respuestaId);
            var topicoResuelto = topicoRepository.getReferenceById(respuesta.getTopico().getId());
            if (topicoResuelto.getEstado() == Estado.CLOSED){
                throw new ValidationException("Este topico ya esta solucionado.");
            }
        }
    }
}
