package com.example.task.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.entities.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Integer> {
	Stock findStockByArticleName(String name);
}
