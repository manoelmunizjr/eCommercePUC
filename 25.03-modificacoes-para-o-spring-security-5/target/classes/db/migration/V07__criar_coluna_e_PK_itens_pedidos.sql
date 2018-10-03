ALTER TABLE itens_pedidos ADD COLUMN codigo_item_pedido BIGINT(20);
ALTER TABLE itens_pedidos ADD CONSTRAINT pk_itens_pedidos PRIMARY KEY (codigo_item_pedido);