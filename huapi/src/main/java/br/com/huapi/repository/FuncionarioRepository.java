package br.com.huapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.huapi.domain.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{

}
