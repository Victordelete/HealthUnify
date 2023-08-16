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
@Table(name = "Endereco")              //definição para tabela
public class Endereco {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@jakarta.persistence.Column(name="pk_endereco")
	private Long pk_endereco;
	
	@jakarta.persistence.Column(name="cidade")
	private String cidade;
	
	@jakarta.persistence.Column(name="bairro")
	private String bairro;
	
	@jakarta.persistence.Column(name="endereco")
	private String endereco;
	
	@jakarta.persistence.Column(name="numero")
	private Integer numero;
	
	@jakarta.persistence.Column(name="fk_paciente")
	private Integer fk_paciente;
	
	@jakarta.persistence.Column(name="fk_funcionario")
	private Integer fk_funcionario; 
	
}
