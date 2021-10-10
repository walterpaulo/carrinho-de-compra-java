package br.com.supera.api.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.supera.api.models.Product;
import br.com.supera.api.services.TDO.NotaTDO;

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
		if (getListaProdutos().isEmpty()) {
			return 0;
		}
		return getListaProdutos().size();
	}
	
//	private Long codigo;
//    private String descricao;
//    private int qtde;
//    private BigDecimal unit;
//    private BigDecimal vlTotal;
//    private BigDecimal vlFrete;
//    private BigDecimal vlTotalF;

	public List<NotaTDO> carrinhoDeCompra() {
		List<NotaTDO> listaObj = new ArrayList<NotaTDO>();
		for (CarrinhoProdutos obj : getListaProdutos()) {
			NotaTDO novo = new NotaTDO(obj.getProduto().getId(), obj.getProduto().getName(), obj.getQtde(),
					obj.getProduto().getPrice(), obj.getProduto().getPrice());
			listaObj.add(novo);
		}

		return listaObj;
	}

	public void removerProdutoPorId(long id) {
		CarrinhoProdutos obj = getListaProdutos().stream().filter(u -> u.getProduto().getId() == id).findFirst().get();
		getListaProdutos().remove(obj);
	}

	public BigDecimal valorDaCompra() {

		BigDecimal valorRetorno = getListaProdutos().stream()
				.map(p1 -> p1.getProduto().getPrice().multiply(new BigDecimal(p1.getQtde())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		return valorRetorno;
	}

	public BigDecimal calcularFrete() {
		FreteProduto frete = new FreteProduto();
		return frete.calcularFrete(valorDaCompra(), valorFrete());
	}

	private BigDecimal valorFrete() {
		BigDecimal valorFrete = new BigDecimal(10).multiply(new BigDecimal(quantidadeProdutos()));
		return valorFrete;

	}

	public void teste() {
		getListaProdutos().stream().forEach(System.out::println);
	}

}
