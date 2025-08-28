package br.com.guilhermevieira.clientes.dto;

public record EnderecoResponseDTO(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf
) {
}
