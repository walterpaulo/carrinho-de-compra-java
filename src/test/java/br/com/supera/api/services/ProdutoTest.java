package br.com.supera.api.services;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;


import br.com.supera.api.models.Product;
import junit.framework.Assert;

public class ProdutoTest {

	private ProdutoService produto;
	

	public ProdutoService getProduto() {
		return produto;
	}

	public void setProduto(ProdutoService produto) {
		this.produto = produto;
	}

	@Before
	public void iniciarCenario() {
		produto = new ProdutoService();
		Product prod1 = new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), Short.parseShort("205"), "/");
		getProduto().adicionar(prod1);
		Product prod2 = new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("150"), "/");
		getProduto().adicionar(prod2);
		Product prod3 = new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("150"), "/");
		getProduto().adicionar(prod3);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void quantidadeProduto_test() {
		
		getProduto().excluirPorId(12L);;

		Assert.assertEquals(2, getProduto().quantidadeItens());
	}


}
