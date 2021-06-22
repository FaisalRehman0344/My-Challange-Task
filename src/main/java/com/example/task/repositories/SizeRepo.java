package com.example.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.entities.Size;
@Repository
public interface SizeRepo extends JpaRepository<Size, Integer> {

}
