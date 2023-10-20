# Desafio Santander & Digital Innovation One Bootcamp - RESTful API em Java

## Descrição

Este projeto faz parte do desafio proposto pelo Bootcamp Santander & Digital Innovation One e consiste em uma RESTful API desenvolvida em Java. O projeto foi inicializado utilizando o Spring Initializer e inclui as seguintes dependências:

- **Spring Web:** Para a criação de APIs RESTful e roteamento de requisições HTTP.
- **Spring Data JPA:** Para a integração com o banco de dados e operações de persistência.
- **H2 Database:** Um banco de dados em memória que facilita o desenvolvimento e testes.
- **PostgreSQL Driver:** Para a conexão com o banco de dados PostgreSQL em ambientes de produção.

## Diagrama

```mermaid
classDiagram
  class User {
    - name: String
    - account: Account
    - card: Card[]
  }

  class Account {
    - number: String
    - agency: String
    - balance: Number
    - limit: Number
  }

  class Card {
    - number: String
    - limit: Number
  }

  User *--|> Account
  User *--|> Card
```

## Exemplos de Requisições de Usuário

### Criar um Novo Usuário

![create user](src/main/resources/static/assets/created.png)

### Error ao tentar criar um usuário já cadastrado

![error user](src/main/resources/static/assets/user-ex.png)

### Buscar um usuário pelo ID

![user by id](src/main/resources/static/assets/find-by-id.png)

### Buscar um usuário com um ID inexistende

![user by id](src/main/resources/static/assets/find-by-id.png)

## H2 - Console

### Retornando todos os usuários cadastrados

![user by id](src/main/resources/static/assets/h2-console01.png)

### Retornando usuário pelo ID

![user by id](src/main/resources/static/assets/h2-console02.png)






