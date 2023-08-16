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

import br.com.huapi.domain.Paciente;
import br.com.huapi.repository.PacienteRepository;

@RestController
@RequestMapping("/Paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/list")
    public List<Paciente> list(){
		List<Paciente> pacientes= null; 
		try {
			pacientes = pacienteRepository.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
        return pacientes;
    }
	
	@PostMapping("/")
	public Paciente savePaciente(@RequestBody Paciente paciente){
		try {
			paciente = pacienteRepository.save(paciente);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return paciente; 
	}
	
	@GetMapping("/{id}")
    public Paciente getPacienteById(@PathVariable("id") Long id){
		Paciente paciente = null; 
		try {
			paciente = pacienteRepository.getReferenceById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
        return paciente; 
    }
	
	@PutMapping("/{id}")
	public Paciente editPaciente(@PathVariable("id") Long id, @RequestBody Paciente paciente) {
		Paciente pacienteEdit = null; 
		try {
			pacienteRepository.save(paciente);
			pacienteEdit = pacienteRepository.getReferenceById(paciente.getPk_paciente());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return pacienteEdit; 
	}
	
	@DeleteMapping("/{id}")
	public Paciente deletePaciente(@PathVariable("id") Long id) {
		Paciente paciente = null; 
		try{
			paciente = pacienteRepository.getReferenceById(id);
			pacienteRepository.deleteById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

        return paciente; 
	}
	
}
