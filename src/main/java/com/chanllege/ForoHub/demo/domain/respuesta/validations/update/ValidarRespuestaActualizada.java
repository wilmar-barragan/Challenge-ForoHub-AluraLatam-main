package com.chanllege.ForoHub.demo.domain.respuesta.validations.update;

import com.desafio.forohub.domain.respuesta.dto.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    void validate(ActualizarRespuestaDTO data, Long respuestaId);
}
