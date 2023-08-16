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

import br.com.huapi.domain.Endereco;
import br.com.huapi.repository.EnderecoRepository;

@RestController
@RequestMapping("/Endereco")
public class EnderecoController {

	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping("/list")
    public List<Endereco> list(){
		List<Endereco> enderecos= null; 
		try {
			enderecos = enderecoRepository.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
        return enderecos;
    }
	
	@PostMapping("/")
	public Endereco savePaciente(@RequestBody Endereco endereco){
		try {
			endereco = enderecoRepository.save(endereco);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return endereco; 
	}
	
	@GetMapping("/{id}")
    public Endereco getPacienteById(@PathVariable("id") Long id){
		Endereco endereco = null; 
		try {
			endereco = enderecoRepository.getReferenceById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
        return endereco; 
    }
	
	@PutMapping("/{id}")
	public Endereco editPaciente(@PathVariable("id") Long id,
			@RequestBody Endereco endereco) {
		Endereco enderecoEdit = null; 
		try {
			enderecoRepository.save(endereco);
			enderecoEdit = enderecoRepository.getReferenceById(endereco.getPk_endereco());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return enderecoEdit; 
	}
	
	@DeleteMapping("/{id}")
	public Endereco deletePaciente(@PathVariable("id") Long id) {
		Endereco endereco = null; 
		try{
			endereco = enderecoRepository.getReferenceById(id);
			enderecoRepository.deleteById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

        return endereco; 
	}
	
}