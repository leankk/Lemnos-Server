package com.lemnos.server.models.dtos.responses;

public record FornecedorResponse(
        String nome,
        Long cnpj,
        Long telefone,
        String email,
        String situacao,
        EnderecoResponse endereco
) { }