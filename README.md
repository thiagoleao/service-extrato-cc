# Serviço de Consulta de Extrato em Conta Corrente

## Sobre
Implementação da estrutura básica de uma API.


## Tecnologias utilizadas
```
Java 1.8
Maven 3
Spring Boot
Spring Security
JPA
H2 interno para tornar os exemplos executáveis
```

## Use
Inicie a aplicação utilizando o plugin maven para Spring Boot, através do comando (`mvn spring-boot:run`). 
A aplicação iniciará na url [http://localhost:8080](http://localhost:8080).

## Autenticação e autorização
Foi implementado o padrão básico de login para a API (`usuário e senha`), para utilizar o serviço de consulta é será necessário se autenticar.

```
usuário: user
senha:   password
```

Basta enviar através do header: **Authorization** com o conteúdo em base64. **Ex:** Authorization: Basic dXNlcjpwYXNzd29yZA==

## Projeto desenvolvido por 
Thiago Leão
