package com.example.task.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Article {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String specification;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Color> colors;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Size> sizes;

	public Article() {
	}

	public Article(int id, String name, String specification, List<Color> colors, List<Size> sizes) {
		this.id = id;
		this.name = name;
		this.specification = specification;
		this.colors = colors;
		this.sizes = sizes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public List<Color> getColors() {
		return colors;
	}

	public void setColors(List<Color> colors) {
		this.colors = colors;
	}

	public List<Size> getSizes() {
		return sizes;
	}

	public void setSizes(List<Size> sizes) {
		this.sizes = sizes;
	}

}
