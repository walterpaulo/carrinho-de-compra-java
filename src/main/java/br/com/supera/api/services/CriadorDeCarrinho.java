package br.com.supera.api.services;

import br.com.supera.api.models.Product;

public class CriadorDeCarrinho {
	private CarrinhoDeCompra carrinho = new CarrinhoDeCompra();

	public CriadorDeCarrinho() {
		super();
	}

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

	public CriadorDeCarrinho tiraProdutoPorId(long id) {
		getCarrinho().removerProdutoPorId(id);
		return this;
	}

	public CarrinhoDeCompra constroi() {
		return getCarrinho();
	}

}
