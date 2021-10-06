package br.com.supera.api.resources;

import java.math.BigDecimal;

import br.com.supera.api.services.CarrinhoDeCompra;
import br.com.supera.api.services.CriadorDeCarrinho;

import br.com.supera.api.models.*;
public class ProdutoResource {

	public static void main(String[] args) {

		CriadorDeCarrinho criador = new CriadorDeCarrinho();
		CarrinhoDeCompra carrinho = criador
				.pegarProduto(
						new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), Short.parseShort("205"), "/"),2)
				.pegarProduto(
						new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("150"), "/"), 2)
				.constroi();
		
		
		
		System.out.println(carrinho.quantidadeProdutos());
		//carrinho.removerProdutoPorId(99L);
		System.out.print(carrinho.quantidadeProdutos());
		System.out.println("ok");
		System.out.println("Valor total: "+ carrinho.valorTotalDaCompra());
		carrinho.teste();
	}
	
	

}
