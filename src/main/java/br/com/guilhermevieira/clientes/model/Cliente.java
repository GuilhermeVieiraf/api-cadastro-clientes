package br.com.guilhermevieira.clientes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    @Column(nullable = false)
    private String nome;
    @Email
    @NotBlank
    @Column(nullable = false, unique = true)
    private String email;

    @Size(min = 8, max = 8)
    @Column(length = 8)
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    @Column(name = "cidade")
    private String localidade;
    @Size(min = 2, max = 2)
    @Column(length = 2)
    private String uf;
}
