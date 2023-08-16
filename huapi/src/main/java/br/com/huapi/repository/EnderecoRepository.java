package br.com.huapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.huapi.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
