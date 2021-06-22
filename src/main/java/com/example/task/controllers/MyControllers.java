package com.example.task.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.entities.Article;
import com.example.task.entities.OrderEntity;
import com.example.task.entities.Stock;
import com.example.task.services.ControllerServices;

import javassist.NotFoundException;

@RestController
public class MyControllers {
	
	@Autowired
	private ControllerServices service;
	
	@PostMapping(value = "/api/addArticle")
	public void addArticle(@RequestBody Article article) throws Exception {
		service.addArticle(article);
	}
	
	@GetMapping(value = "/api/getArticles")
	public List<Article> getArticles(){
		return service.getArticles();
	}
	
	@PutMapping(value = "/api/updateArticle")
	public String updateArticle(@RequestBody Article article) throws NotFoundException {
		return service.updateArticle(article);
	}
	
	@DeleteMapping(value = "/api/deleteArticle/{id}")
	public String deleteArticle(@PathVariable int id) throws NotFoundException {
		return service.deleteArticle(id);
	}
	
	@GetMapping(value = "/api/getStock")
	public List<Stock> getStock(){
		return service.getStock();
	}
	
	@PostMapping(value = "/api/addStock")
	public void addStock(@RequestBody Stock stock) throws Exception {
		service.addStock(stock);
	}
	
	@PostMapping(value = "/api/generateOrder")
	public void generateOrder(@RequestBody OrderEntity order) throws Exception {
		service.generateOrder(order);
	}
}
