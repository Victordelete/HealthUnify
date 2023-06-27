package br.com.huapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.domain.GuiaAtendimento;
import br.com.huapi.repository.GuiaAtendimentoRepository;

@RestController
@RequestMapping("/GuiaAtendimento")
public class GuiaAtendimentoController {

	@Autowired
	private GuiaAtendimentoRepository guiaAtendimentoRepository;
}
