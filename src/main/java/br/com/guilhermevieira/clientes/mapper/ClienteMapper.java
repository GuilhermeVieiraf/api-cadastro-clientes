package br.com.guilhermevieira.clientes.mapper;

import br.com.guilhermevieira.clientes.dto.ClienteRequestDTO;
import br.com.guilhermevieira.clientes.dto.ClienteResponseDTO;
import br.com.guilhermevieira.clientes.dto.EnderecoResponseDTO;
import br.com.guilhermevieira.clientes.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    @Mapping(source = "requestDTO.cep", target = "cep")
    Cliente toEntity(ClienteRequestDTO requestDTO, EnderecoResponseDTO enderecoDTO);

    ClienteResponseDTO toResponseDTO(Cliente cliente);
}
