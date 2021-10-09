package br.com.supera.api.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.supera.api.models.Product;
import br.com.supera.api.repositorys.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	private List<Product> produto = new ArrayList<Product>();
	
	public ProdutoService() {
		super();
		this.produto = new ArrayList<Product>();
	}

	public List<Product> getProduto() {
		return repository.findAll();
	}

	public void setProduto(List<Product> produto) {
		this.produto = produto;
	}
	
	public Product adicionar(Product produto) {
		getProduto().add(produto);
		return produto;
	}
	public void excluir(Product produto) {
		getProduto().remove(produto);
	}
	public Product excluirPorId(long id) {
		Product obj = getProduto().stream().filter(p -> p.getId() == id).findFirst().get();
		getProduto().remove(obj);
		return obj;
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
	
	public List<Product> listaPorPreco(){
		List<Product> listaNome = getProduto()
				.stream().sorted((p1,p2) -> p1.getPrice().compareTo(p2.getPrice()))
				.collect(Collectors.toList());
		 return listaNome;
	}
	
	public List<Product> listaPorScore(){
		
		return getProduto();
	}
	
	

}
