package br.com.supera.api.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.supera.api.models.Product;

@Repository
public interface ProdutoRepository extends JpaRepository<Product, Long> {
	
	@Query("select p from Product p order by p.name")
    List<Product> ordenarPorNome();

    @Query("select p from Product p order by p.price desc")
    List<Product> ordenarPorPrice();

    @Query("select p from Product p order by p.score desc")
    List<Product> ordenarPorScoce();


}
