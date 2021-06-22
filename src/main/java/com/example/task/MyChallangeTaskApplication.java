package com.example.task;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.task.repositories"})
@EntityScan(basePackages = {"com.example.task.entities"})
public class MyChallangeTaskApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyChallangeTaskApplication.class, args);
	}
}
