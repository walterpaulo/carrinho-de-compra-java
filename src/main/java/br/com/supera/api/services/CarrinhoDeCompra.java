package br.com.supera.api.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.supera.api.models.Product;

public class CarrinhoDeCompra {
	private List<CarrinhoProdutos> listaProdutos;

	public CarrinhoDeCompra() {
		super();
		this.listaProdutos = new ArrayList<CarrinhoProdutos>();
	}

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

	public void removerProdutoPorId(long id) {
		CarrinhoProdutos obj = getListaProdutos().stream().filter(u -> u.getProduto().getId() == id).findFirst().get();
		getListaProdutos().remove(obj);
	}

	public BigDecimal valorTotalDaCompra() {

		BigDecimal valorRetorno = getListaProdutos().stream()
				.map(p1 -> p1.getProduto().getPrice().multiply(new BigDecimal(p1.getQtde())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		return valorRetorno;
	}

	public BigDecimal calcularFrete() {
		FreteProduto frete = new FreteProduto();
		return frete.calcularFrete(valorTotalDaCompra(), valorFrete());
	}
	private BigDecimal valorFrete() {
		BigDecimal valorFrete = new BigDecimal(10).multiply(new BigDecimal(quantidadeProdutos()));
		return valorFrete;

	}

	public void teste() {
		getListaProdutos().stream().forEach(System.out::println);
	}

}
