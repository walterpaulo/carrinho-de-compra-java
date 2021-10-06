package br.com.supera.api.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

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

	public void teste() {
		getListaProdutos().stream().forEach(System.out::println);
	}

}
