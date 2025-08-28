package br.com.guilhermevieira.clientes.repository;

import br.com.guilhermevieira.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
}
