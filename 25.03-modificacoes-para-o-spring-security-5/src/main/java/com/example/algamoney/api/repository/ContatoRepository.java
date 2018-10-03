package com.example.algamoney.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
	
	//public Page<Contato> findByNomeContaining(String nome, Pageable pageable);

}
