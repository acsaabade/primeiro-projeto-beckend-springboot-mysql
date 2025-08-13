# 📦 Sistema de Cadastro de Produtos

## 📌 Funcionalidades

- ✅ Cadastro de produtos via requisição **POST** no endpoint `/api/produtos`
- ✅ Validação de dados de entrada
- ✅ Integração com banco de dados MySQL
- ✅ Documentação automática com Swagger (OpenAPI)

---

## 📁 Estrutura do Projeto

src/
├── main/
│ ├── java/
│ │ └── br/com/e2etreinamentos/meu/sistema/
│ │ ├── controller/
│ │ ├── model/
│ │ ├── repository/
│ │ └── MeuSistemaApplication.java
│ └── resources/
│ ├── application.properties
│ └── static/
└── test/



---

## 🔗 Endpoint da API

### POST `/api/produtos`

Cadastra um novo produto no sistema.


## 📚 Documentação da API

http://localhost:8080/swagger-ui.html



## 🧪 Testes
Execute os testes com:
mvn test


## 🛠️ Requisitos
Java 21

Maven 3.9+

MySQL 8+