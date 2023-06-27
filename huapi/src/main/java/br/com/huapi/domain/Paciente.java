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
@Table(name = "Paciente")              //definição para tabela
public class Paciente {
	@Id
	private Integer pk_paciente;
	private String nome;
	private String sobrenome; 
	private String cpf;
	private String rg;
	private Date data_nascimento; 
	
}

