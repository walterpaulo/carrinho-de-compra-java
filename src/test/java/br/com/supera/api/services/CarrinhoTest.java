package br.com.supera.api.services;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import com.graphbuilder.math.AddNode;

import br.com.supera.api.models.Product;
import junit.framework.Assert;

public class CarrinhoTest {

	private CarrinhoDeCompra compra;

	public CarrinhoDeCompra getCompra() {
		return compra;
	}

	public void setCompra(CarrinhoDeCompra compra) {
		this.compra = compra;
	}

	@Before
	public void iniciarCenario() {
		CriadorDeCarrinho criador = new CriadorDeCarrinho();
		CarrinhoDeCompra carrinho = criador
				.pegarProduto(
						new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), Short.parseShort("205"), "/"),2)
				.pegarProduto(
						new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("150"), "/"), 1)
				.constroi();

	}
	@Test
	public void quantidadedeProduto() {
		Assert.assertEquals(2, getCompra().quantidadeProdutos());
		
	}

}
