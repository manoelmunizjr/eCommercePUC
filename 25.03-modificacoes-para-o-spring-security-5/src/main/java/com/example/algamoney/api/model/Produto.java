package com.example.algamoney.api.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long codigo;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private Long quantidade;
		
	private String status;
	
	private String img1;
	
	private String img2;
	
	private String img3;
	
	private String img4;
	
	private String img5;
	
	@NotNull
	@ManyToOne
	//@Column(name="codigo_categoria")
	private Categoria codigoCategoria;
	
	@NotNull
	@ManyToOne
	//@Column(name="codigo_fornecedor")
	private Fornecedor codigoFornecedor;
	
	private boolean ativo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getImg1() {
		return img1;
	}

	public void setImg1(String img1) {
		this.img1 = img1;
	}

	public String getImg2() {
		return img2;
	}

	public void setImg2(String img2) {
		this.img2 = img2;
	}

	public String getImg3() {
		return img3;
	}

	public void setImg3(String img3) {
		this.img3 = img3;
	}

	public String getImg4() {
		return img4;
	}

	public void setImg4(String img4) {
		this.img4 = img4;
	}

	public String getImg5() {
		return img5;
	}

	public void setImg5(String img5) {
		this.img5 = img5;
	}

	public Categoria getCodigoCategoria() {
		return codigoCategoria;
	}

	public void setCodigoCategoria(Categoria codigoCategoria) {
		this.codigoCategoria = codigoCategoria;
	}

	public Fornecedor getCodigoFornecedor() {
		return codigoFornecedor;
	}

	public void setCodigoFornecedor(Fornecedor codigoFornecedor) {
		this.codigoFornecedor = codigoFornecedor;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((codigoCategoria == null) ? 0 : codigoCategoria.hashCode());
		result = prime * result + ((codigoFornecedor == null) ? 0 : codigoFornecedor.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((img1 == null) ? 0 : img1.hashCode());
		result = prime * result + ((img2 == null) ? 0 : img2.hashCode());
		result = prime * result + ((img3 == null) ? 0 : img3.hashCode());
		result = prime * result + ((img4 == null) ? 0 : img4.hashCode());
		result = prime * result + ((img5 == null) ? 0 : img5.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Produto other = (Produto) obj;
		if (ativo != other.ativo)
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (codigoCategoria == null) {
			if (other.codigoCategoria != null)
				return false;
		} else if (!codigoCategoria.equals(other.codigoCategoria))
			return false;
		if (codigoFornecedor == null) {
			if (other.codigoFornecedor != null)
				return false;
		} else if (!codigoFornecedor.equals(other.codigoFornecedor))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (img1 == null) {
			if (other.img1 != null)
				return false;
		} else if (!img1.equals(other.img1))
			return false;
		if (img2 == null) {
			if (other.img2 != null)
				return false;
		} else if (!img2.equals(other.img2))
			return false;
		if (img3 == null) {
			if (other.img3 != null)
				return false;
		} else if (!img3.equals(other.img3))
			return false;
		if (img4 == null) {
			if (other.img4 != null)
				return false;
		} else if (!img4.equals(other.img4))
			return false;
		if (img5 == null) {
			if (other.img5 != null)
				return false;
		} else if (!img5.equals(other.img5))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	
}
