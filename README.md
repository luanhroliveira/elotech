# Elotech
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/luanhroliveira/elotech/blob/main/LICENSE) 

# Sobre o projeto

https://luanhroliveira-elotech.herokuapp.com

Esse projeto consiste em uma API Rest de cadastro de pessoas e contatos.
Uma pessoa tem no mínimo um contato, e um contato pertence a uma única pessoa.
 
## Requisitos:

- Possuir ao menos os endpoints: GET(Buscar uma única Pessoa), GET (Busca paginada opção de filtro para retornar várias pessoas), POST, PUT, DELETE. <font color="green">[CONCLUÍDO]</font>
- O cadastro de pessoa deve ter os campos: Id, Nome, CPF, Data de nascimento. <font color="green"> [CONCLUÍDO]</font>
- A pessoa deve possuir uma lista de contatos (relacionamento um para muitos) com os campos: Id, Nome, Telefone e Email. <font color="green">[CONCLUÍDO]</font>
- Os dados devem ser persistidos utilizando um banco de dados relacional. <font color="green">[CONCLUÍDO]</font>

## Validações:
<font color="green"> Some green text </font>
- Todos os campos são obrigatórios, tanto da pessoa como do contato. <font color="green">[CONCLUÍDO]</font>
- A Pessoa deve possuir ao menos um contato. <font color="green">[CONCLUÍDO]</font>
- O CPF deve ser um CPF válido. <font color="green">[CONCLUÍDO]</font>
- A Data de nascimento não pode ser uma data futura. <font color="green">[CONCLUÍDO]</font>
- Validar sintaxe do email do contato. <font color="green">[CONCLUÍDO]</font>

## Requisitos técnicos:

- Deverão ser criados testes unitários. <font color="green">[CONCLUÍDO]</font>
- Publicar o código em repositório público. <font color="green">[CONCLUÍDO]</font>

## É opcional e será um diferencial:

- Implementar o front-end para consumir a API.
    (Desejável que seja em ReactJS ou Angular). <font color="red">[NÃO CONCLUÍDO]</font>
- Publicar a aplicação na internet utilizando algum provedor, para que possa ser acessado sem necessidade de rodar o projeto local. <font color="green">[CONCLUÍDO]</font>

----------------------------------------------------------------------
### Get
https://luanhroliveira-elotech.herokuapp.com/pessoas

Método para retornar todos os registros de pessoas com seus respectivos contatos.

----------------------------------------------------------------------
### Get
https://luanhroliveira-elotech.herokuapp.com/pessoas/1

Método para retornar um registro de pessoa específico, com todos os seus contatos.

----------------------------------------------------------------------
### Put
https://luanhroliveira-elotech.herokuapp.com/pessoas/1/status

Método para alterar o status da pessoa de inativo para ativo, e vice-versa.

----------------------------------------------------------------------
### Put
https://luanhroliveira-elotech.herokuapp.com/pessoas/1

Métoo para editar o campo alterado passado por parâmetro no arquivo Json.

----------------------------------------------------------------------
### Post
https://luanhroliveira-elotech.herokuapp.com/pessoas

Método para fazer a inserção de pessoa e contatos.

----------------------------------------------------------------------

### Delete
https://luanhroliveira-elotech.herokuapp.com/pessoas/1

Método para deletar por id a pessoa e todos os seus contatos.

----------------------------------------------------------------------


## Modelo conceitual
![Modelo Conceitual](https://github.com/luanhroliveira/assets/blob/main/modelo-conceitual.png "Modelo conceitual")


## Padrão camadas adotado

![Image](https://github.com/luanhroliveira/assets/blob/main/camadas.png "Padrão camadas")

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate

## Implantação em produção
- Back end: Heroku
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 11

```bash
# clonar repositório
git clone https://github.com/luanhroliveira/elotech.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Luan Higor Ribeiro de Oliveira.

https://www.linkedin.com/in/luanhroliveira
