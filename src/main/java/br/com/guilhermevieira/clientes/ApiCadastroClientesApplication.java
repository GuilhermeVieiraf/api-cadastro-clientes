package br.com.guilhermevieira.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiCadastroClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiCadastroClientesApplication.class, args);
	}

}
