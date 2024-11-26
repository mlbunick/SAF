# Sistema de Administração de Funcionários API (Em Desenvolvimento)

Este projeto é uma API RESTful para gerenciamento de funcionários, desenvolvida com **Spring Boot 3**, **Spring Data JPA**, **MySQL** e **Maven**. A API permite realizar operações CRUD (Create, Read, Update, Delete) nos registros de funcionários.

---

## Funcionalidades

A API suporta as seguintes operações relacionadas aos funcionários:

1. **Adicionar Funcionário**  
   Endpoint para criar um novo funcionário no sistema.

2. **Remover Funcionário**  
   Permite excluir um funcionário pelo ID.

3. **Listar Todos os Funcionários**  
   Retorna uma lista com todos os funcionários cadastrados.

4. **Atualizar Funcionário**  
   Endpoint para modificar informações de um funcionário existente.

5. **Deletar Funcionário**  
   Similar à funcionalidade de remover, mas pode incluir regras específicas de remoção lógica.

---

## Tecnologias Utilizadas

- **Java 17**  
- **Spring Boot 3**  
- **Spring Data JPA**  
- **MySQL**  
- **Maven**  
- **Postman** (para testes de API)  

---

## Pré-requisitos

- **JDK 17** ou superior  
- **MySQL** instalado e configurado  
- Ferramenta de IDE como IntelliJ IDEA ou Eclipse  
- Postman ou qualquer outra ferramenta de teste de API  

---

## Configuração do Banco de Dados

1. Crie um banco de dados no MySQL:  
   ```sql
   CREATE DATABASE saf;
   
# Configurações do Banco de Dados
spring.datasource.url=jdbc:mysql://localhost:3306/saf <br/>
spring.datasource.username=SEU_USUARIO <br/>
spring.datasource.password=SUA_SENHA

# Configurações do Hibernate
spring.jpa.hibernate.ddl-auto=update <br/>
spring.jpa.show-sql=true

# Configurações do Servidor
server.port=8080
