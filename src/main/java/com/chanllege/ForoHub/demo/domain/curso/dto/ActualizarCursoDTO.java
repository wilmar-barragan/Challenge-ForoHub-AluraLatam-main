package com.chanllege.ForoHub.demo.domain.curso.dto;

import com.desafio.forohub.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}