package br.com.huapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.huapi.domain.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

}
