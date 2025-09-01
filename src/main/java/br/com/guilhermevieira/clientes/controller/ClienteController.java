package br.com.guilhermevieira.clientes.controller;

import br.com.guilhermevieira.clientes.dto.ClienteRequestDTO;
import br.com.guilhermevieira.clientes.dto.ClienteResponseDTO;
import br.com.guilhermevieira.clientes.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteResponseDTO> cadastrar(@RequestBody @Valid ClienteRequestDTO requestDTO) {
        var clienteSalvo = clienteService.cadastrarCliente(requestDTO);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(clienteSalvo.id())
                .toUri();

        return ResponseEntity.created(location).body(clienteSalvo);
    }


}
