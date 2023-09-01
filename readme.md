# Healthunify - integra��o de dados hospitalares

<hr>

## Conceitos

Projeto trata-se de estrutura de banco de dados para persist�ncia de dados refrentes a diferentes hospitais, com seus respectivos funcion�rios, pacientes e guias de atendimento.

A conex�o com os dados persistidos ocorre por meio de API desenvolvida com SringBoot.  

A API n�o foi implementada com camada de service, ficando o controller respons�vel pela inje��o da interface com JPA para conex�es ao BD. 

### M�todos
Requisi��es para a API devem seguir os padr�es:

| M�todo | Descri��o |
|---|---|
| `GET` | Retorna informa��es de um ou mais registros. |
| `POST` | Utilizado para criar um novo registro. |
| `PUT` | Atualiza dados de um registro ou altera sua situa��o. |
| `DELETE` | Remove um registro do sistema. |

## Banco de Dados

Neste projeto optou-se pela gest�o de dados utilizando PostgreSQL. O modelo de dados foram implementados em linguagem SQl, e acrescidos em um script .sql. Este script pode ser acionado por meio de um programa de implementa��o em Python para sua instala��o. 

As tabelas geradas s�o: 

* Contato. 
* Endere�o. 
* Funcion�rio. 
* Guia de Atendimento.
* Hospital. 
* Paciente. 

As tabelas de Pacientes e Funcion�rios compartilham de informa��es armazenadas para Contato e Endere�o.

## Testes

A principio n�o forma implementados testes automatizados para o projeto, ficando a cargo somente de testes diretos realizados utilizando dados de amostra. Requisi��es testadas com o Postman. 



 