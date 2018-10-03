package com.example.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoney.api.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
	
}
