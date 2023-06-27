package br.com.huapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.repository.PacienteRepository;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;
}
