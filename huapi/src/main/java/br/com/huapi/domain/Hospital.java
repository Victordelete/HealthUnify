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
@Table(name = "Hospital")              //definição para tabela
public class Hospital {
	@Id
	private Integer pk_hospital;
	private String nome_social;
	private String nome_fantasia; 
	private String cnpj;
	private String ins_estadual;
	private Integer num_leitos; 
	private Integer num_utis; 
	private Short lotacao_atual; 
	
}
