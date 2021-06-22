package com.example.task.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.entities.OrderEntity;

@Repository
public interface OrderEntityRepo extends JpaRepository<OrderEntity, Integer> {

}
