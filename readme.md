# 🛒 ShoppingE2E

Projeto desenvolvido em **Spring Boot** com integração ao **MySQL** para gerenciamento de produtos em um sistema de compras.  
Inclui documentação de API com **Swagger (OpenAPI)** e segue boas práticas de arquitetura.

---

## 🚀 Tecnologias Utilizadas

- [Java 21](https://openjdk.org/projects/jdk/21/)
- [Spring Boot 3.5.4](https://spring.io/projects/spring-boot)
  - Spring Web
  - Spring Data JPA
  - Spring Validation
- [MySQL](https://www.mysql.com/)
- [Lombok](https://projectlombok.org/)
- [Swagger / Springdoc OpenAPI](https://springdoc.org/)
- [Maven](https://maven.apache.org/)

---

## 📂 Estrutura do Projeto

shoppinge2e
┣ 📂 src/main/java/br/com/e2etreinamentos/shoppinge2e
┃ ┣ 📂 controller # Controladores REST
┃ ┣ 📂 model # Entidades (JPA)
┃ ┣ 📂 repository # Interfaces de repositório
┃ ┣ 📂 service # Regras de negócio
┃ ┗ Application.java # Classe principal
┣ 📂 src/main/resources
┃ ┣ application.properties # Configurações do projeto
┗ pom.xml


📖 Documentação da API
A documentação da API pode ser acessada via Swagger UI:

👉 http://localhost:8080/swagger-ui.html