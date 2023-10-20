# Bootcamp Santander & DIO - Desafio Java RESTful API

## Descrição

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

  User --|> Account
  User --|> Card
```
