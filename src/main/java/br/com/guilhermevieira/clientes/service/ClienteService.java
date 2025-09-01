package br.com.guilhermevieira.clientes.service;

import br.com.guilhermevieira.clientes.client.ViaCepClient;
import br.com.guilhermevieira.clientes.dto.ClienteRequestDTO;
import br.com.guilhermevieira.clientes.dto.ClienteResponseDTO;
import br.com.guilhermevieira.clientes.mapper.ClienteMapper;
import br.com.guilhermevieira.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ViaCepClient viaCepClient;
    private final ClienteMapper clienteMapper;

    public ClienteResponseDTO cadastrarCliente(ClienteRequestDTO requestDTO) {
        var endereco = viaCepClient.buscarEnderecoPorCep(requestDTO.cep());
        var cliente = clienteMapper.toEntity(requestDTO, endereco);
        var clienteSalvo = clienteRepository.save(cliente);

        return clienteMapper.toResponseDTO(clienteSalvo);
    }
}
