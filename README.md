💳 Desafio Júnior: Sistema de Empréstimos

Projeto em Java com Spring Boot criado como desafio para nível Júnior, simulando a verificação de empréstimos disponíveis para clientes com base em idade, renda e localização.

🔹 Funcionalidades

Recebe dados do cliente: nome, idade, renda e localização.

Retorna uma lista de empréstimos disponíveis com tipo e taxa de juros.

Regras de negócios simples para diferentes faixas de renda, idade e estado.

⚙️ Tecnologias Utilizadas

Java 17

Spring Boot

Maven

API REST

JSON

📁 Estrutura do Projeto
src/
├─ main/
│   ├─ java/
│   │   └─ com/example/desafioJr/
│   │       ├─ controller/  # Controles da API (LoanController)
│   │       └─ DesafioJrApplication.java
│   └─ resources/
│       └─ application.properties

📌 Observações

Não há banco de dados; todas as regras são processadas em memória.

Pode ser expandido para incluir mais tipos de empréstimo, simulações de parcelas ou integração com banco de dados no futuro.