package com.project.javaSpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.javaSpringBoot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
