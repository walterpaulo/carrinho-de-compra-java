package br.com.supera.api.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private BigDecimal price;
	private short score;
	private String image;

	public Product() {
		super();
	}
	


	public Product(long id, String name, BigDecimal price, short score, String image) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.score = score;
		this.image = image;
	}

}