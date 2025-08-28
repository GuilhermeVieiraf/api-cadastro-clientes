package br.com.guilhermevieira.clientes.client;

import br.com.guilhermevieira.clientes.dto.EnderecoResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    EnderecoResponseDTO buscarEnderecoPorCep(@PathVariable("cep") String cep);
}
