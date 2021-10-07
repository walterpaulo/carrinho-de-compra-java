package br.com.supera.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.supera.api.models.Product;
import br.com.supera.api.repositorys.ProdutoRepository;
import br.com.supera.api.services.ProdutoService;

public class ProdutoControllers {
	
	private ProdutoService service;
	@Autowired
	private ProdutoRepository repository;
	
	public void adicionar(Product produto) {
		repository.save(service.adicionar(produto));
	}
	
	public void removerPorId(long id) {
		repository.delete(service.excluirPorId(id));
	}
	
	public List<Product> listaTudo(){
		return service.listar();
	}
	public List<Product> listaNome(){
		return service.listaPorNome();
	}
	public List<Product> listaPreco(){
		return service.listaPorPreco();
	}

}
