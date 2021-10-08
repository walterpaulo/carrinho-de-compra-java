package br.com.supera.api.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.api.controllers.ProdutoControllers;
import br.com.supera.api.models.Product;

@RestController
@RequestMapping("/produto/v1")
public class ProdutoResource {

	private ProdutoControllers controllers;

	@GetMapping("")
	public ResponseEntity<List<Product>> listaProduto() {
		return ResponseEntity.ok().build();
	}

}
