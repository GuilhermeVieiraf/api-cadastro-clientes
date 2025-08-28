package br.com.guilhermevieira.clientes.dto;

import java.util.UUID;

public record ClienteResponseDTO(
        UUID id,
        String nome,
        String email,
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade, // cidade
        String uf
) {
}
