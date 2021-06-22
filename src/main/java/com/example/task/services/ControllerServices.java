package com.example.task.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.entities.Article;
import com.example.task.entities.OrderEntity;
import com.example.task.entities.Stock;
import com.example.task.repositories.ArticleRepo;
import com.example.task.repositories.OrderEntityRepo;
import com.example.task.repositories.StockRepo;

import javassist.NotFoundException;

@Service
public class ControllerServices {
	
	@Autowired
	private ArticleRepo articleRepo;
	
	@Autowired
	private StockRepo stockRepo;
	
	@Autowired
	private OrderEntityRepo orderRepo;
	
	public void addArticle(Article article) throws Exception {
		try {
			articleRepo.save(article);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public List<Article> getArticles(){
		return articleRepo.findAll();
	}
	
	public String updateArticle(Article newArticle) throws NotFoundException {
		try {
			Article article = articleRepo.findByName(newArticle.getName());
			article.setColors(newArticle.getColors());
			article.setName(newArticle.getName());
			article.setSizes(newArticle.getSizes());
			article.setSpecification(newArticle.getSpecification());
			articleRepo.save(article);
			return "Article updated successfully.";
		} catch (Exception e) {
			throw new NotFoundException("No Article found to update", e);
		}
	}
	
	public String deleteArticle(int id) throws NotFoundException {
		try {
			articleRepo.deleteById(id);
			return "Deleted successfully.";
		} catch (Exception e) {
			throw new NotFoundException("No article available with this Id",e);
		}
	}
	
	public List<Stock> getStock() {
		return stockRepo.findAll();
	}
	
	public void generateOrder(OrderEntity order) throws Exception {
		try {
			Stock stock = stockRepo.findStockByArticleName(order.getArticle().getName());
			int remainingStock;
			int quantity = order.getQuantity();
			int availableStock = stock.getQuantity();
			if (stock != null && availableStock != 0) {
				remainingStock = availableStock - quantity; 
				stock.setQuantity(remainingStock);
				orderRepo.save(order);
				stockRepo.save(stock);
			} else {
				throw new NotFoundException("No Stock Available.");
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	public void addStock(Stock newStock) throws Exception {
		try {
			stockRepo.save(newStock);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
}
