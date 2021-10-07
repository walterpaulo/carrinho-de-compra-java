package br.com.supera.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.supera.api.models.Product;

public class ProdutoService {
	private List<Product> produto = new ArrayList<Product>();
	

	public ProdutoService() {
		super();
		this.produto = new ArrayList<Product>();
	}

	public List<Product> getProduto() {
		return produto;
	}

	public void setProduto(List<Product> produto) {
		this.produto = produto;
	}
	
	public void adicionar(Product produto) {
		getProduto().add(produto);
	}
	public void excluir(Product produto) {
		getProduto().remove(produto);
	}
	public void excluirPorId(long id) {
		Product obj = getProduto().stream().filter(p -> p.getId() == id).findFirst().get();
		getProduto().remove(obj);
	}
	
	public List<Product> listar(){
		return getProduto();
	}
	
	public int quantidadeItens() {
		return getProduto().size();
	}
	
	public List<Product> listaPorNome(){
		List<Product> listaNome = getProduto()
				.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName()))
				.collect(Collectors.toList());
		 return listaNome;
	}
	
	

}
