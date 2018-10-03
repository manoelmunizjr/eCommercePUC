
CREATE TABLE fornecedor (
		codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
		razao_social VARCHAR(100) NOT NULL,
		nome_fantasia VARCHAR(100) NOT NULL, 
		cnpj BIGINT(20) NOT NULL,
		logradouro VARCHAR(30),
		numero VARCHAR(30),
		complemento VARCHAR(30),
		bairro VARCHAR(30),
		cep VARCHAR(30),
		cidade VARCHAR(30),
		estado VARCHAR(30),
		ativo BOOLEAN NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;

		
CREATE TABLE produto (
		codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
		nome VARCHAR(50) NOT NULL,
		descricao VARCHAR(300) NOT NULL,
		valor DECIMAL(10,2) NOT NULL,
		quantidade BIGINT(5) NOT NULL,
		status VARCHAR(100),
		img1 VARCHAR(200),
		img2 VARCHAR(200),
		img3 VARCHAR(200),
		img4 VARCHAR(200),
		img5 VARCHAR(200),
		codigo_categoria BIGINT(20) NOT NULL,
		codigo_fornecedor BIGINT(20) NOT NULL,
		ativo BOOLEAN NOT NULL,
		FOREIGN KEY (codigo_categoria) REFERENCES categoria(codigo),
		FOREIGN KEY (codigo_fornecedor) REFERENCES fornecedor(codigo)
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;


