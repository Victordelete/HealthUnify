# Healthunify - integração de dados hospitalares

<hr>

## Conceitos

Projeto trata-se de estrutura de banco de dados para persistência de dados refrentes a diferentes hospitais, com seus respectivos funcionários, pacientes e guias de atendimento.

A conexão com os dados persistidos ocorre por meio de API desenvolvida com SringBoot.  

A API não foi implementada com camada de service, ficando o controller responsável pela injeção da interface com JPA para conexões ao BD. 

### Métodos
Requisições para a API devem seguir os padrões:

| Método | Descrição |
|---|---|
| `GET` | Retorna informações de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situação. |
| `DELETE` | Remove um registro do sistema. |

## Banco de Dados

Neste projeto optou-se pela gestão de dados utilizando PostgreSQL. O modelo de dados foram implementados em linguagem SQl, e acrescidos em um script .sql. Este script pode ser acionado por meio de um programa de implementação em Python para sua instalação. 

As tabelas geradas são: 

* Contato. 
* Endereço. 
* Funcionário. 
* Guia de Atendimento.
* Hospital. 
* Paciente. 

As tabelas de Pacientes e Funcionários compartilham de informações armazenadas para Contato e Endereço.

## Testes

A principio não forma implementados testes automatizados para o projeto, ficando a cargo somente de testes diretos realizados utilizando dados de amostra. Requisições testadas com o Postman. 



 