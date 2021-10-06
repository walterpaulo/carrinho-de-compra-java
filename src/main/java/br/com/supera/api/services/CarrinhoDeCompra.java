package br.com.supera.api.services;

import java.util.List;

import br.com.supera.api.models.Product;

public class CarrinhoDeCompra {
	private List<CarrinhoProdutos> listaProdutos;

	public List<CarrinhoProdutos> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<CarrinhoProdutos> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	public void incluirProduto(Product produto, int qtde) {
		getListaProdutos().add(new CarrinhoProdutos(produto, qtde));
	}
	public int quantidadeProdutos() {
		return getListaProdutos().size();
	}
	

}
