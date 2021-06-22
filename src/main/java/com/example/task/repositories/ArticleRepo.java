package com.example.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.entities.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article, Integer> {
	Article findByName(String name);
}
