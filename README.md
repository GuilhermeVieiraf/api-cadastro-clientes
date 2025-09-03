# API de Cadastro de Clientes com Consulta de CEP

![Status do Projeto](https://img.shields.io/badge/status-conclu%C3%ADdo-green)
![Linguagem](https://img.shields.io/badge/java-21-blue)
![Framework](https://img.shields.io/badge/spring%20boot-3.x-brightgreen)

Uma API RESTful completa para cadastro de clientes, construída com Java e Spring Boot, que preenche automaticamente o endereço do cliente a partir de um CEP válido.

---

## Sobre o Projeto

Este projeto foi desenvolvido como um exercício prático para aprofundar e consolidar conhecimentos no ecossistema Spring. A aplicação consiste em uma API REST que gerencia o cadastro de clientes e implementa uma funcionalidade chave: ao receber um novo cadastro com um CEP, a API consome um serviço externo (ViaCEP) para buscar e preencher automaticamente os dados de endereço, garantindo maior precisão das informações e uma melhor experiência de uso.

O foco foi aplicar as melhores práticas de desenvolvimento, desde a arquitetura em camadas até um fluxo de trabalho profissional com Git e tratamento de exceções.

---

## Funcionalidades

* ✅ **Endpoint de Cadastro de Clientes:** Rota `POST /clientes` para criar novos usuários.
* ✅ **Consulta de Endereço Automática:** Integração em tempo real com a API ViaCEP usando **OpenFeign** para buscar o endereço a partir do CEP.
* ✅ **Validação de Dados:** Uso do **Bean Validation** para garantir a integridade dos dados na entrada da API.
* ✅ **Tratamento de Exceções:** Implementação de um manipulador global (`@RestControllerAdvice`) para retornar erros claros e status HTTP corretos para casos como CEP não encontrado ou e-mail duplicado.
* ✅ **Arquitetura em Camadas:** Código organizado em camadas de `Controller`, `Service` e `Repository` para uma clara separação de responsabilidades.
* ✅ **Mapeamento de Objetos Automatizado:** Uso do **MapStruct** para converter DTOs em Entidades de forma segura e eficiente, sem código boilerplate.

---

## Tecnologias Utilizadas

O projeto foi construído utilizando as seguintes tecnologias:

* **Backend:** Java 21, Spring Boot 3
* **Comunicação Web:** Spring Web (REST Controller), Spring Cloud OpenFeign
* **Persistência de Dados:** Spring Data JPA, Hibernate
* **Banco de Dados:** PostgreSQL
* **Ambiente:** Docker
* **Mapeamento e Utilitários:** MapStruct, Lombok
* **Build & Dependências:** Maven

---



##  Autor

Guilherme Vieira

* **LinkedIn:** [https://www.linkedin.com/in/guilhermevieirafelix](https://www.linkedin.com/in/guilhermevieirafelix/)   **GitHub:** [https://github.com/GuilhermeVieiraf](https://github.com/GuilhermeVieiraf)
