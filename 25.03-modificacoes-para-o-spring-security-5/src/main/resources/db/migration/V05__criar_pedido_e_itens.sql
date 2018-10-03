
CREATE TABLE pedido (
		codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
		data_pedido DATE NOT NULL,
		data_envio DATE NOT NULL,
		data_entrega DATE NOT NULL,
		valor_total DECIMAL(10,2) NOT NULL,
		frete DECIMAL(10,2) NOT NULL,
		status VARCHAR(100),
		codigo_pessoa BIGINT(20) NOT NULL,
		FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;	


CREATE TABLE itens_pedidos (
		preco_unitario DECIMAL(10,2) NOT NULL,
		quantidade BIGINT(5) NOT NULL,
		codigo_pedido BIGINT(20) NOT NULL,
		codigo_produto BIGINT(20) NOT NULL,
		FOREIGN KEY (codigo_pedido) REFERENCES pedido(codigo),
		FOREIGN KEY (codigo_produto) REFERENCES produto(codigo)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;
