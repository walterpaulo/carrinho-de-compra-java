package br.com.supera.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.supera.api.models.Product;
import br.com.supera.api.repositorys.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository repository;
	
	public ProdutoService() {
		super();
	}

	public List<Product> getProduto() {
		return repository.findAll();
	}
	
	public List<Product> getProdutoNome() {
		return repository.findAll();
	}
	
	public List<Product> getProdutoScore() {
		return repository.findAll();
	}



}
