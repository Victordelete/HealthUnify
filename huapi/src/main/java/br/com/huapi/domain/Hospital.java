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
@Table(name = "Hospital")              //definição para tabela
public class Hospital {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@jakarta.persistence.Column(name="pk_hospital")
	private Long pk_hospital;
	
	@jakarta.persistence.Column(name="nome_social")
	private String nome_social;
	
	@jakarta.persistence.Column(name="nome_fantasia")
	private String nome_fantasia;
	
	@jakarta.persistence.Column(name="cnpj")
	private String cnpj;
	
	@jakarta.persistence.Column(name="ins_estadual")
	private String ins_estadual;
	
	@jakarta.persistence.Column(name="num_leitos")
	private Integer num_leitos;
	
	@jakarta.persistence.Column(name="num_utis")
	private Integer num_utis;
	
	@jakarta.persistence.Column(name="lotacao_atual")
	private Short lotacao_atual; 
}
