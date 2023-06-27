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
@Table(name = "GuiaAtendimento")              //definição para tabela
public class GuiaAtendimento {
	@Id
	private Integer pk_endereco;
	private Date horario_chegada;
	private String classificacao; 
	private String path_prontuario;
	private Integer fk_hospital;
	private Integer fk_paciente; 
	private Integer fk_funcionario; 
	
}
