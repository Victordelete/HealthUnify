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

import br.com.huapi.domain.GuiaAtendimento;
import br.com.huapi.repository.GuiaAtendimentoRepository;

@RestController
@RequestMapping("/GuiaAtendimento")
public class GuiaAtendimentoController {

	@Autowired
	private GuiaAtendimentoRepository guiaAtendimentoRepository;
	
	@GetMapping("/list")
    public List<GuiaAtendimento> list(){
		List<GuiaAtendimento> guiasAtendimento = null; 
		try {
			guiasAtendimento = guiaAtendimentoRepository.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
        return guiasAtendimento;
    }
	
	@PostMapping("/")
	public GuiaAtendimento savePaciente(@RequestBody GuiaAtendimento guiaAtendimento){
		try {
			guiaAtendimento = guiaAtendimentoRepository.save(guiaAtendimento);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return guiaAtendimento; 
	}
	
	@GetMapping("/{id}")
    public GuiaAtendimento getGuiaById(@PathVariable("id") Long id){
		GuiaAtendimento guiaAtendimento = null; 
		try {
			guiaAtendimento = guiaAtendimentoRepository.getReferenceById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
        return guiaAtendimento; 
    }
	
	@PutMapping("/{id}")
	public GuiaAtendimento editGuiaAtendimento(@PathVariable("id") Long id, 
			@RequestBody GuiaAtendimento guiaAtendimento) {
		GuiaAtendimento guiaAtendimentoEdit = null; 
		try {
			guiaAtendimentoRepository.save(guiaAtendimento);
			guiaAtendimentoEdit = guiaAtendimentoRepository.getReferenceById(guiaAtendimento.getPk_guiaAtendimento());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return guiaAtendimentoEdit; 
	}
	
	@DeleteMapping("/{id}")
	public GuiaAtendimento deleteGuiaPaciente(@PathVariable("id") Long id) {
		GuiaAtendimento guiaAtendimento = null; 
		try{
			guiaAtendimento = guiaAtendimentoRepository.getReferenceById(id);
			guiaAtendimentoRepository.deleteById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

        return guiaAtendimento; 
	}
	
}