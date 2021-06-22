package com.example.task.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int price;
	private int quantity;

	@OneToOne(cascade = CascadeType.ALL)
	private Article article;

	public Stock() {
	}

	public Stock(int id, int price, int quantity, Article article) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.article = article;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Article getarticle() {
		return article;
	}

	public void setarticle(Article article) {
		this.article = article;
	}
}
