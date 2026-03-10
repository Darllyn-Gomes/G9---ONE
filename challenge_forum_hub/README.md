# Forum Hub API

API REST para gerenciamento de tópicos de um fórum, com autenticação de usuários via JWT.  
Construído com **Java 17**, **Spring Boot 3**, **MySQL 8** e **Spring Security**.

---

## 📝 Descrição do Projeto

O **Forum Hub** permite que usuários criem, visualizem, atualizem e excluam tópicos de discussão.  
A API garante:

- Autenticação segura de usuários via JWT  
- Persistência de dados no banco MySQL  
- Validação de dados obrigatórios  
- Controle de acesso baseado em token  
- Histórico e listagem de tópicos com paginação opcional

---

## ⚙️ Tecnologias Utilizadas

- Java 17+  
- Spring Boot 3  
- Maven 4+  
- MySQL 8+  
- Spring Security  
- Spring Data JPA  
- Flyway Migration  
- Validation  
- Lombok

---

## 💾 Pré-requisitos

Antes de rodar a aplicação, certifique-se de ter:

- Java 17+ instalado
- Maven 4+ instalado
- MySQL 8+ instalado
- Banco de dados criado (`forum_hub_db`)

---

## 🔧 Configuração

No arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/forum_hub_db
spring.datasource.username=root
spring.datasource.password=senha123
spring.jpa.hibernate.ddl-auto=update

# JWT
jwt.secret=chavesecreta123
jwt.expiration=3600000
🚀 Como Executar

Clonar o repositório:

git clone https://github.com/endereco/Forum_Hub.git

Entrar na pasta do projeto:

cd Forum_Hub

Rodar a aplicação com Maven:

mvn spring-boot:run

Testar endpoints no Postman ou Insomnia.

🗂 Estrutura de Endpoints
🔑 Autenticação

POST /login

Recebe:

{
  "login": "usuario",
  "senha": "123456"
}

Retorna:

{
  "token": "jwt_token_aqui"
}

Utilize o token nas requisições protegidas com header:

Authorization: Bearer <token>
📌 Usuários

POST /usuarios

Cria um novo usuário

{
  "login": "usuario",
  "senha": "123456"
}
📝 Tópicos

POST /topicos - Criar tópico

{
  "titulo": "Erro ao rodar Spring Boot",
  "mensagem": "Recebo NullPointerException",
  "autor": "Daniel",
  "curso": "Java Backend"
}

GET /topicos - Listar todos os tópicos

Opcional: paginação com ?page=0&size=10

GET /topicos/{id} - Detalhar tópico por ID

PUT /topicos/{id} - Atualizar tópico

{
  "titulo": "Erro resolvido",
  "mensagem": "NullPointerException corrigida",
  "autor": "Daniel",
  "curso": "Java Backend"
}

DELETE /topicos/{id} - Excluir tópico



📚 Referências

Spring Boot Official Documentation

Spring Security Documentation

Flyway Migration

JWT Auth in Java

🏆 Conclusão

Este projeto serve como portfólio de backend Java, demonstrando:

Implementação de API RESTful

Autenticação JWT

CRUD completo com validação

Integração com banco MySQL

Boas práticas de desenvolvimento profissional