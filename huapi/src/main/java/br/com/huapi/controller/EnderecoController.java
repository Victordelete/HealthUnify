package br.com.huapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.repository.EnderecoRepository;

@RestController
@RequestMapping("/Endereco")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
}
