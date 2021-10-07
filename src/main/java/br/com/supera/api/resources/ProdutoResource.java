package br.com.supera.api.resources;

import java.math.BigDecimal;

import br.com.supera.api.services.ProdutoService;
import br.com.supera.api.models.*;
public class ProdutoResource {

	public static void main(String[] args) {

		System.out.println("===========Produto=================");
		final ProdutoService service = new ProdutoService();
		
		service.adicionar(new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("156"), "/"));
		service.adicionar(new Product(99L, "Call Of Duty WWII", new BigDecimal("249.99"), Short.parseShort("205"), "/"));
		service.adicionar(new Product(12L, "Mortal Kombal XL", new BigDecimal("69.99"), Short.parseShort("150"), "/"));
		

		System.out.println("\n Normal");
		service.listar().stream().forEach(System.out::println);
		
		System.out.println("\n Nome");
		service.listaPorNome().stream().forEach(System.out::println);
		
		System.out.println("\n Preço");
		service.listaPorPreco().stream().forEach(System.out::println);
		
		System.out.println("\n Score");
		service.listaPorScore().stream().forEach(System.out::println);

		System.out.println("============================");
	}
	
	

}
