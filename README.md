# Projeto Segurança com Spring Security + JWT
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE) 

# Sobre o projeto

Este projeto demonstra autenticação e autorização em uma API REST utilizando **Spring Security** e **JWT**.  
A aplicação possui endpoints públicos, protegidos por login e restritos para administradores.

# Como executar o projeto

## Pré-requisitos
- Java 17+
- Maven

## Passos
```bash
# clonar repositório
git clone https://github.com/seu-repositorio.git

# entrar na pasta do projeto
cd demosecurity3

# rodar o projeto
./mvnw spring-boot:run


A aplicação será executada em:
👉 http://localhost:8080

Endpoints principais
1) Login (gera token JWT)

POST /auth/login

Body (JSON):

{
  "username": "user",
  "senha": "user123"
}


Resposta:

{
  "token": "seu_token_jwt_aqui"
}

2) Endpoint público

GET /public/health

➡ Acesso livre (não precisa de token).

3) Endpoint protegido

GET /api/hello

Header:

Authorization: Bearer <seu_token>


➡ Requer token válido (qualquer usuário).

4) Endpoint restrito para ADMIN

GET /api/admin

Header:

Authorization: Bearer <seu_token>


➡ Requer usuário com papel ADMIN.

Usuários de exemplo (carregados automaticamente)

user / user123 → ROLE_USER

admin / admin123 → ROLE_ADMIN

```

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring Security
- JWT
- JPA / Hibernate
- Maven
## Implantação em produção
- Banco de dados: H2

```

# Autores

- Gustavo Henrique Azambuja
- Daniel Garcia 
- Matheus Masera
