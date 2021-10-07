package br.com.supera.api.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.supera.api.models.Product;

@Repository
public interface ProdutoController extends JpaRepository<Product, Long>{

}
