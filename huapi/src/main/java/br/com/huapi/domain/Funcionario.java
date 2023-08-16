package br.com.huapi.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity           
@Table(name = "Funcionario")              //definição para tabela
public class Funcionario {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@jakarta.persistence.Column(name="pk_funcionario")
	private Long pk_funcionario;
	
	@jakarta.persistence.Column(name="nome")
	private String nome;
	
	@jakarta.persistence.Column(name="sobrenome")
	private String sobrenome;
	
	@jakarta.persistence.Column(name="cpf")
	private String cpf;
	
	@jakarta.persistence.Column(name="rg")
	private String rg;
	
	@jakarta.persistence.Column(name="horario")
	private String horario;
	
	@jakarta.persistence.Column(name="especialidade")
	private String especialidade;
	
	@jakarta.persistence.Column(name="data_nascimento")
	private Date data_nascimento; 
}