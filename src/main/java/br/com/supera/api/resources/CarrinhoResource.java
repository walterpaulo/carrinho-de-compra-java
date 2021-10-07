package br.com.supera.api.resources;

import java.math.BigDecimal;

import br.com.supera.api.models.Product;
import br.com.supera.api.services.CarrinhoDeCompra;
import br.com.supera.api.services.CriadorDeCarrinho;

public class CarrinhoResource {

	public static void main(String[] args) {

		System.out.println("===========Produto=================");

		CriadorDeCarrinho criador = new CriadorDeCarrinho();
		CarrinhoDeCompra carrinho = criador.pegarProduto(
				new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), Short.parseShort("205"), "/"), 1)
				.constroi();

		System.out.println(carrinho.quantidadeProdutos());
		// carrinho.removerProdutoPorId(99L);
		System.out.print(carrinho.quantidadeProdutos());
		System.out.println("ok");
		System.out.println("Valor total: " + carrinho.valorTotalDaCompra() + " Frete: " + carrinho.calcularFrete());
		carrinho.teste();
		System.out.println("============================");
	}

}