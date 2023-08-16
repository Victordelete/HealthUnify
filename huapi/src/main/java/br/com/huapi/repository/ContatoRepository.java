package br.com.huapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.huapi.domain.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
