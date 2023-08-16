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

import br.com.huapi.domain.Hospital;
import br.com.huapi.repository.HospitalRepository;

@RestController
@RequestMapping("/Hospital")
public class HospitalController {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	
	@GetMapping("/list")
    public List<Hospital> list(){
		List<Hospital> hospitals= null; 
		try {
			hospitals = hospitalRepository.findAll();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
        return hospitals;
    }
	
	@PostMapping("/")
	public Hospital saveHospital(@RequestBody Hospital hospital){
		try {
			hospital = hospitalRepository.save(hospital);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return hospital; 
	}
	
	@GetMapping("/{id}")
    public Hospital getHospitalById(@PathVariable("id") Long id){
		Hospital hospital = null; 
		try {
			hospital = hospitalRepository.getReferenceById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
        return hospital; 
    }
	
	@PutMapping("/{id}")
	public Hospital editHospital(@PathVariable("id") Long id, @RequestBody Hospital hospital) {
		Hospital hospitalEdit = null; 
		try {
			hospitalRepository.save(hospital);
			hospitalEdit = hospitalRepository.getReferenceById(hospital.getPk_hospital());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return hospitalEdit; 
	}
	
	@DeleteMapping("/{id}")
	public Hospital deletePaciente(@PathVariable("id") Long id) {
		Hospital hospital = null; 
		try{
			hospital = hospitalRepository.getReferenceById(id);
			hospitalRepository.deleteById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

        return hospital; 
	}
	
}
