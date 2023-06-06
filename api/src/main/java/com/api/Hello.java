package com.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
	
	@GetMapping("/bemvindo")
	public String fTeste() {
		return 	"Api utilizada para comunicação das informações relevantes "
				+ "para unificação do sistema de saúde de uma região com vários "
				+ "hospitais e pontos de atendimento.";
	}

}
