ALTER TABLE fornecedor ADD COLUMN codigo_cidade BIGINT(20);
ALTER TABLE fornecedor ADD CONSTRAINT fk_fornecedor_cidade FOREIGN KEY (codigo_cidade) REFERENCES cidade(codigo);
