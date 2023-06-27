package br.com.huapi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.huapi.domain.Funcionario;
import br.com.huapi.repository.FuncionarioRepository;

@RestController
@RequestMapping("/Funcionario")
public class FuncionarioController {
	
	@Autowired 
	private FuncionarioRepository funcionarioRepository;
	
	@GetMapping("/{id}")
	public Funcionario getFuncionarioById(@PathVariable("id") Integer id){
		Optional<Funcionario> funcionarioFind = this.funcionarioRepository.findById(id);
	
		if(funcionarioFind.isPresent()){
            return funcionarioFind.get(); 
        }

        return null;
	}
	
	@PostMapping("/")
	public Funcionario postFuncionario(@RequestBody Funcionario funcionario){
        return this.funcionarioRepository.save(funcionario);
    }
}
