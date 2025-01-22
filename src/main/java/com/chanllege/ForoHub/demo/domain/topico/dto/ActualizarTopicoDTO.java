package com.chanllege.ForoHub.demo.domain.topico.dto;

import com.desafio.forohub.domain.topico.Estado;

public record ActualizarTopicoDTO (
        String titulo,
        String mensaje,
        Estado estado,
        Long cursoId
){
}
