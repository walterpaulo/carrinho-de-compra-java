package br.com.supera.api.services;

import br.com.supera.api.models.Product;

public class CriadorDeCarrinho {
	private CarrinhoDeCompra carrinho;

	public CarrinhoDeCompra getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoDeCompra carrinho) {
		this.carrinho = carrinho;
	}

	public CriadorDeCarrinho pegarProduto(Product produto, int quantidade) {
		getCarrinho().incluirProduto(produto, quantidade);
		return this;
	}

	public CarrinhoDeCompra constroi() {
		return getCarrinho();
	}

}
