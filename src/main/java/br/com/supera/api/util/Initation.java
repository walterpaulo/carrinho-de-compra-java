package br.com.supera.api.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.supera.api.models.Product;
import br.com.supera.api.repositorys.ProdutoRepository;

@Configuration
public class Initation implements CommandLineRunner {
	@Autowired
	ProdutoRepository repository;

	@Override
	public void run(String... args) throws Exception {

		Product prod1 = new Product(312L, "Super Mario Odyssey", BigDecimal.valueOf(197.88), Short.valueOf("100"),
				"super-mario-odyssey.png");
		Product prod2 = new Product(201L, "Call Of Duty Infinite Warfare", BigDecimal.valueOf(49.99),
				Short.valueOf("250"), "the-witcher-iii-wild-hunt.png");
		Product prod3 = new Product(102L, "The Witcher III Wild Hunt", BigDecimal.valueOf(119.5), Short.valueOf("205"),
				"call-of-duty-wwii.png");
		Product prod4 = new Product(99L, "Call Of Duty WWII", BigDecimal.valueOf(249.99), Short.valueOf("50"), "/");
		Product prod5 = new Product(12L, "Mortal Kombat XL", BigDecimal.valueOf(69.99), Short.valueOf("150"),
				"mortal-kombat-xl.png");
		Product prod6 = new Product(74L, "Shards of Darkness", BigDecimal.valueOf(71.94), Short.valueOf("400"),
				"shards-of-darkness.png");
		Product prod7 = new Product(31L, "Terra Média: Sombras de Mordor", BigDecimal.valueOf(250), Short.valueOf("50"),
				"terra-media-sombras-de-mordor.png");
		Product prod8 = new Product(420L, "FIFA 18", BigDecimal.valueOf(195.39), Short.valueOf("325"), "fifa-18.png");
		Product prod9 = new Product(501L, "Horizon Zero Dawn", BigDecimal.valueOf(250), Short.valueOf("50"), "/");
		Product prod10 = new Product(1L, "Teclado", BigDecimal.valueOf(115.8), Short.valueOf("290"),
				"horizon-zero-dawn.png");
		
		List<Product> produtos= Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6,prod7,prod8,prod9,prod10);
		repository.saveAll(produtos);

	}
}
