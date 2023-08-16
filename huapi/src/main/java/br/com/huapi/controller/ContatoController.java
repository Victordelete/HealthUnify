package br.com.huapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.domain.Contato;
import br.com.huapi.repository.ContatoRepository;

@RestController
@RequestMapping("/Contato")
public class ContatoController {
	
	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping("/list")
    public List<Contato> list(){
		List<Contato> contatos= null; 
		try {
			contatos = contatoRepository.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
        return contatos;
    }
	
	@PostMapping("/")
	public Contato savePaciente(@RequestBody Contato contato){
		try {
			contato = contatoRepository.save(contato);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return contato; 
	}
	
	@GetMapping("/{id}")
    public Contato getPacienteById(@PathVariable("id") Long id){
		Contato contato = null; 
		try {
			contato = contatoRepository.getReferenceById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
        return contato; 
    }
	
	@PutMapping("/{id}")
	public Contato editPaciente(@PathVariable("id") Long id,
			@RequestBody Contato contato) {
		Contato contatoEdit = null; 
		try {
			contatoRepository.save(contato);
			contatoEdit = contatoRepository.getReferenceById(contato.getPk_contato());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return contatoEdit; 
	}
	
	@DeleteMapping("/{id}")
	public Contato deletePaciente(@PathVariable("id") Long id) {
		Contato contato = null; 
		try{
			contato = contatoRepository.getReferenceById(id);
			contatoRepository.deleteById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

        return contato; 
	}
	
}