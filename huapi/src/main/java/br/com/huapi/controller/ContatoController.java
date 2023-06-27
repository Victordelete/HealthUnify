package br.com.huapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.repository.ContatoRepository;

@RestController
@RequestMapping("/Contato")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;

}
