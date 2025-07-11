# 05-cambio-service

## English

This project is a simple Spring Boot microservice that exposes currency exchange rates. It uses MySQL as database and Flyway for schema versioning. When the application starts the migrations in `src/main/resources/db/migration` are executed automatically.
If needed, you can run the migrations manually with `./mvnw flyway:migrate`.

### Requirements

- Java 17
- MySQL running and reachable on `jdbc:mysql://localhost:3306/` with a schema named `cambio_service`

### Building and running
```bash
./mvnw clean package
./mvnw spring-boot:run
GET http://localhost:8000/cambio-service/100/USD/BRL
## Português

Este projeto é um microserviço simples feito com Spring Boot que fornece taxas de câmbio. Ele utiliza MySQL como banco de dados e o Flyway para versionar o esquema. As migrações contidas em `src/main/resources/db/migration` são executadas automaticamente na inicialização da aplicação.
Caso necessário, é possível executá-las manualmente com `./mvnw flyway:migrate`.

### Requisitos

- Java 17
- MySQL em funcionamento acessível em `jdbc:mysql://localhost:3306/` com o schema `cambio_service`

### Compilação e execução
```bash
./mvnw clean package
./mvnw spring-boot:run
GET http://localhost:8000/cambio-service/100/USD/BRL
​:codex-file-citation[codex-file-citation]{line_range_start=1 line_range_end=47 path=README.md git_url="https://github.com/kramires/05-cambio-service/blob/main/README.md#L1-L47"}​

