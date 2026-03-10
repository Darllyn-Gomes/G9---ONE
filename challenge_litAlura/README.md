# 📚 LiterAlura - Catálogo de Livros

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.2-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)

## 📖 Sobre o Projeto

O **LiterAlura** é uma aplicação desenvolvida em Java utilizando **Spring Boot**, que consome dados da API de livros e armazena essas informações em um banco de dados relacional.

O objetivo do projeto é praticar:

* Consumo de **API REST**
* Manipulação de **JSON**
* Persistência de dados com **JPA**
* Uso de **banco de dados PostgreSQL**
* Estruturação de aplicações Java com **Spring Boot**

A aplicação funciona através de um **menu interativo no terminal**, onde o usuário pode buscar livros, listar autores e consultar informações armazenadas no banco de dados.

---

## 🚀 Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

* Java 17
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven
* API Gutendex (Project Gutenberg)
* Jackson (para conversão de JSON)

---

## 🌐 API Utilizada

A aplicação consome dados da:

**Gutendex API**

Uma API gratuita que fornece informações sobre mais de **70 mil livros** do Project Gutenberg.

Exemplo de consulta:

https://gutendex.com/books/?search=dom+casmurro

---

## ⚙️ Funcionalidades do Sistema

A aplicação possui um menu com as seguintes opções:

### 🔎 1 - Buscar livro pelo título

Realiza uma consulta na API Gutendex e salva o livro encontrado no banco de dados.

Dados armazenados:

* Título
* Autor
* Idioma
* Número de downloads

---

### 📚 2 - Listar livros registrados

Exibe todos os livros que foram salvos no banco de dados.

---

### 👨‍💻 3 - Listar autores

Mostra todos os autores cadastrados juntamente com seus livros.

Informações exibidas:

* Nome
* Ano de nascimento
* Ano de falecimento
* Livros associados

---

### 📅 4 - Listar autores vivos em determinado ano

Permite buscar autores que estavam vivos em um determinado ano informado pelo usuário.

---

### 🌎 5 - Listar livros por idioma

Permite listar livros de acordo com o idioma.

Idiomas disponíveis:

| Código | Idioma    |
| ------ | --------- |
| PT     | Português |
| EN     | Inglês    |
| ES     | Espanhol  |
| FR     | Francês   |

---

### 📊 Estatísticas

O sistema também permite visualizar estatísticas sobre os livros cadastrados, como a quantidade de livros por idioma.

---

## 🗄️ Banco de Dados

O sistema utiliza **PostgreSQL** para armazenar os dados.

Entidades principais:

### 📖 Livro

* id
* título
* idioma
* downloads
* autor_id

### 👤 Autor

* id
* nome
* ano de nascimento
* ano de falecimento

Relacionamento:

Autor (1) ---- (N) Livro

---

## 🧩 Estrutura do Projeto

```
src
 ├── main
 │   ├── java
 │   │   ├── model
 │   │   ├── repository
 │   │   ├── service
 │   │   └── principal
 │   └── resources
 │       └── application.properties
```

---

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```
git clone https://github.com/SEU-USUARIO/literalura.git
```

---

### 2️⃣ Configurar o banco de dados

Criar um banco no PostgreSQL:

```
CREATE DATABASE literalura;
```

---

### 3️⃣ Configurar o arquivo `application.properties`

```
spring.datasource.url=jdbc:postgresql://localhost/literalura
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 4️⃣ Executar o projeto

Rodar a aplicação na sua IDE ou via terminal:

```
mvn spring-boot:run
```

---

## 🖥️ Exemplo de Uso

```
1 - Buscar livro pelo título
2 - Listar livros
3 - Listar autores
4 - Autores vivos em determinado ano
5 - Listar livros por idioma
0 - Sair
```

---

## 🎯 Objetivo do Desafio

Este projeto foi desenvolvido como parte do desafio **LiterAlura**, com o objetivo de praticar:

* Consumo de APIs
* Persistência de dados
* Programação orientada a objetos
* Uso de Spring Boot em aplicações Java

---

## 📜 Licença

Este projeto foi desenvolvido para fins educacionais.
