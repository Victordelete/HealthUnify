package br.com.huapi.domain;

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
@Table(name = "Contato")              //definição para tabela
public class Contato {
	@Id
	private Integer pk_contato;
	private String telefone;
	private String celular; 
	private String email;
	private String celular_emergencia;
	private Integer fk_paciente; 
	private Integer fk_funcionario; 
	
}
