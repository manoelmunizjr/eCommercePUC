package com.example.algamoney.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "itens_pedidos")
public class ItensPedidos {
	
	@Id
	@Column(name="codigo_item_pedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoItemPedido;
	
	@NotNull
	@Column(name="preco_unitario")
	private BigDecimal precoUnitario;
	
	@NotNull
	private Long quantidade;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_pedido")
	private Pedido codigoPedido; 
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "codigo_produto")
	private Produto codigoProtuo;
			

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public Pedido getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Pedido codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Produto getCodigoProtuo() {
		return codigoProtuo;
	}

	public void setCodigoProtuo(Produto codigoProtuo) {
		this.codigoProtuo = codigoProtuo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoPedido == null) ? 0 : codigoPedido.hashCode());
		result = prime * result + ((codigoProtuo == null) ? 0 : codigoProtuo.hashCode());
		result = prime * result + ((precoUnitario == null) ? 0 : precoUnitario.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItensPedidos other = (ItensPedidos) obj;
		if (codigoPedido == null) {
			if (other.codigoPedido != null)
				return false;
		} else if (!codigoPedido.equals(other.codigoPedido))
			return false;
		if (codigoProtuo == null) {
			if (other.codigoProtuo != null)
				return false;
		} else if (!codigoProtuo.equals(other.codigoProtuo))
			return false;
		if (precoUnitario == null) {
			if (other.precoUnitario != null)
				return false;
		} else if (!precoUnitario.equals(other.precoUnitario))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		return true;
	}
		

}
