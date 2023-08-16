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
@Table(name = "GuiaAtendimento")              //definição para tabela
public class GuiaAtendimento {
	@Id()
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@jakarta.persistence.Column(name="pk_guiaAtendimento")
	private Long pk_guiaAtendimento;
	
	@jakarta.persistence.Column(name="horario_chegada")
	private Date horario_chegada;
	
	@jakarta.persistence.Column(name="classificacao")
	private String classificacao;
	
	@jakarta.persistence.Column(name="path_prontuario")
	private String path_prontuario;
	
	@jakarta.persistence.Column(name="fk_hospital")
	private Integer fk_hospital;
	
	@jakarta.persistence.Column(name="fk_paciente")
	private Integer fk_paciente;
	
	@jakarta.persistence.Column(name="fk_funcionario")
	private Integer fk_funcionario; 
}
