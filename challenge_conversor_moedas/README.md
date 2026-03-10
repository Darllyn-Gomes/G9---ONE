# 💱 Conversor de Moedas - Java

## 📌 Descrição

O **Conversor de Moedas** é uma aplicação desenvolvida em **Java** que permite converter valores entre diferentes moedas utilizando dados atualizados de uma **API de taxas de câmbio**.

O programa funciona através de uma **interface textual no console**, onde o usuário escolhe a moeda de origem, a moeda de destino e o valor a ser convertido.

A aplicação realiza uma **requisição HTTP para uma API de câmbio**, processa a resposta em **JSON utilizando a biblioteca Gson** e realiza o cálculo da conversão.

Este projeto foi desenvolvido como parte do **Challenge Java do programa Oracle Next Education (ONE) em parceria com a Alura**.

---

# 🚀 Funcionalidades

- ✔ Conversão de moedas em tempo real
- ✔ Consumo de API de taxas de câmbio
- ✔ Interface interativa no terminal
- ✔ Menu de opções para o usuário
- ✔ Processamento de dados JSON
- ✔ Uso de requisições HTTP em Java
- ✔ Conversão entre múltiplas moedas

---

# 💰 Moedas disponíveis

| Código | Moeda |
|------|------|
| USD | Dólar Americano |
| BRL | Real Brasileiro |
| ARS | Peso Argentino |
| BOB | Boliviano Boliviano |
| CLP | Peso Chileno |
| COP | Peso Colombiano |

---

# 🛠 Tecnologias utilizadas

Este projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java 17
- Gson 2.10+
- HTTP Client (Java)
- API ExchangeRate
- Scanner (entrada de dados)

---

# 🌐 API utilizada

A aplicação utiliza a **ExchangeRate API** para obter as taxas de câmbio atualizadas.

Ela fornece:

- taxas de conversão atualizadas
- resposta em formato JSON
- suporte a diversas moedas

Exemplo de endpoint utilizado:


https://v6.exchangerate-api.com/v6/SUA_API_KEY/latest/USD


---

# 📂 Estrutura do projeto


ConversorDeMoedas
│
├── src
│ ├── Main.java
│ ├── ConversorMoedas.java
│ ├── ConsultaMoeda.java
│
├── README.md


Descrição dos arquivos:

| Arquivo | Função |
|------|------|
| Main.java | Classe principal do programa |
| ConversorMoedas.java | Lógica de conversão |
| ConsultaMoeda.java | Requisição para API |

---

# ⚙️ Como executar o projeto

## 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seuusuario/conversor-moedas.git
2️⃣ Abrir o projeto

Abra o projeto em uma IDE Java, como:

IntelliJ IDEA

Eclipse

VS Code

3️⃣ Adicionar a biblioteca Gson

Baixe a biblioteca no Maven Central:

https://mvnrepository.com/artifact/com.google.code.gson/gson

Ou adicione manualmente ao projeto.

4️⃣ Executar o projeto

Execute a classe:

Main.java
🖥 Exemplo de funcionamento

Menu exibido no terminal:

***********************************
Bem-vindo ao Conversor de Moedas
***********************************

1 - Dólar para Real
2 - Real para Dólar
3 - Dólar para Peso Argentino
4 - Peso Argentino para Dólar
5 - Dólar para Peso Colombiano
6 - Peso Colombiano para Dólar
7 - Sair

Escolha uma opção:

Exemplo de conversão:

Digite o valor que deseja converter:

100

Resultado:

100 USD = 497.50 BRL
📸 Demonstração

Você pode adicionar capturas de tela da aplicação funcionando.

Exemplo:

/images/menu.png
/images/conversao.png
🎥 Vídeo do projeto funcionando

Adicione um vídeo mostrando a aplicação em funcionamento.

Exemplo:

https://youtube.com/seu-video
🧠 Conceitos aplicados

Durante o desenvolvimento deste projeto foram aplicados conceitos importantes de programação em Java:

Requisições HTTP com HttpClient

Criação de HttpRequest

Tratamento de HttpResponse

Manipulação de JSON com Gson

Estruturas de decisão

Loops

Entrada de dados com Scanner

Consumo de APIs

📚 Aprendizados

Este projeto permitiu aprender:

como consumir APIs em Java

como trabalhar com JSON

como estruturar um projeto Java

como criar um sistema interativo no terminal

como organizar um projeto no GitHub

🏆 Challenge ONE - Oracle Next Education

Este projeto foi desenvolvido como parte do:

Challenge Conversor de Moedas - Java

Programa:

Oracle Next Education + Alura

📄 Licença

Este projeto é de uso educacional e foi desenvolvido para fins de aprendizado. 