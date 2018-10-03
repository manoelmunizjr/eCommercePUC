package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
