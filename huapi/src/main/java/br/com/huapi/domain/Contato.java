package br.com.huapi.domain;


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
@Table(name = "Contato")              //definição para tabela
public class Contato {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@jakarta.persistence.Column(name="pk_contato")
	private Long pk_contato;
	
	@jakarta.persistence.Column(name="telefone")
	private String telefone;
	
	@jakarta.persistence.Column(name="celular")
	private String celular;
	
	@jakarta.persistence.Column(name="email")
	private String email;
	
	@jakarta.persistence.Column(name="celular_emergencia")
	private String celular_emergencia;
	
	@jakarta.persistence.Column(name="fk_paciente")
	private Long fk_paciente;
	
	@jakarta.persistence.Column(name="fk_funcionario")
	private Long fk_funcionario; 
	
}
