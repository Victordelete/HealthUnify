package br.com.huapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.huapi.domain.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital, Integer>{

}
