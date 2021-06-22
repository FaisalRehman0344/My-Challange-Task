package com.example.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.entities.Color;
@Repository
public interface ColorRepo extends JpaRepository<Color, Integer> {

}
