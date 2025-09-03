package br.com.guilhermevieira.clientes.service;

import br.com.guilhermevieira.clientes.client.ViaCepClient;
import br.com.guilhermevieira.clientes.dto.ClienteRequestDTO;
import br.com.guilhermevieira.clientes.dto.ClienteResponseDTO;
import br.com.guilhermevieira.clientes.exception.CepNaoEncontradoException;
import br.com.guilhermevieira.clientes.exception.EmailJaCadastradoException;
import br.com.guilhermevieira.clientes.mapper.ClienteMapper;
import br.com.guilhermevieira.clientes.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ViaCepClient viaCepClient;
    private final ClienteMapper clienteMapper;

    public ClienteResponseDTO cadastrarCliente(ClienteRequestDTO requestDTO) {
        var endereco = viaCepClient.buscarEnderecoPorCep(requestDTO.cep());

        if (endereco == null || endereco.cep() == null) {
            throw new CepNaoEncontradoException("CEP não encontrado ou inválido: " + requestDTO.cep());
        }
        var cliente = clienteMapper.toEntity(requestDTO, endereco);

        try {
            var clienteSalvo = clienteRepository.save(cliente);
            return clienteMapper.toResponseDTO(clienteSalvo);
        }catch (DataIntegrityViolationException e) {
            throw new EmailJaCadastradoException("Este e-mail já está cadastrado.");
        }
    }
}
