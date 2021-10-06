package br.com.supera.api.services;

import br.com.supera.api.models.Product;

public class CarrinhoProdutos {
	private Product produto;
	private int qtde;

	public CarrinhoProdutos(Product produto, int qtde) {
		super();
		this.produto = produto;
		this.qtde = qtde;
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}

}
