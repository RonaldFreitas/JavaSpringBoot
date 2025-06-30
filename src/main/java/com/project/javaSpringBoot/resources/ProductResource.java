package com.project.javaSpringBoot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.javaSpringBoot.entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@GetMapping(value = "/get")
	public ResponseEntity<Product> getProduct() {
		Product product = new Product(1L, "Iphone 15", 1, 4500.00);
		return ResponseEntity.ok(product);
	}
}
