CREATE TABLE usuario (
	codigo BIGINT(20) PRIMARY KEY,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE pessoa (
		codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
		nome VARCHAR(50) NOT NULL,
		email VARCHAR(50) NOT NULL,
		cpf BIGINT(20) NOT NULL, 
		data_nascimento DATE NOT NULL,
		sexo VARCHAR(20) NOT NULL,
		logradouro VARCHAR(30),
		numero VARCHAR(30),
		complemento VARCHAR(30),
		bairro VARCHAR(30),
		cep VARCHAR(30),
		codigo_cidade BIGINT(20),
		ativo BOOLEAN NOT NULL,
		codigo_usuario BIGINT(20) NOT NULL,		
		FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo)		
	) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE permissao (
	codigo BIGINT(20) PRIMARY KEY,
	descricao VARCHAR(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE usuario_permissao (
	codigo_usuario BIGINT(20) NOT NULL,
	codigo_permissao BIGINT(20) NOT NULL,
	PRIMARY KEY (codigo_usuario, codigo_permissao),
	FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo),
	FOREIGN KEY (codigo_permissao) REFERENCES permissao(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE contato (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	codigo_pessoa BIGINT(20) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	email VARCHAR(100) NOT NULL,
	telefone VARCHAR(20) NOT NULL,
  FOREIGN KEY (codigo_pessoa) REFERENCES pessoa(codigo)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


