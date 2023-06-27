package br.com.huapi.domain;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter             //criar os getters e setter pelo lombok
@AllArgsConstructor //cria construtores para todos atributos pelo lombok
@NoArgsConstructor  //cria construtores para nenhum argumento
@Entity           
@Table(name = "Funcionario")              //definição para tabela
public class Funcionario {
	@Id
	private Integer pk_funcionario;
	private String nome;
	private String sobrenome; 
	private String cpf;
	private String rg;
	private String horario; 
	private String especialidade; 
	private Date data_nascimento; 
}