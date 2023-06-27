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
@Table(name = "Endereco")              //definição para tabela
public class Endereco {
	@Id
	private Integer pk_endereco;
	private String cidade;
	private String bairro; 
	private String endereco;
	private Integer numero;
	private Integer fk_paciente; 
	private Integer fk_funcionario; 
	
}
