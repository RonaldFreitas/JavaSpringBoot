package com.project.javaSpringBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.javaSpringBoot.entities.Product;
import com.project.javaSpringBoot.repositories.ProductRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		Product iphone = new Product(null, "Iphone 15", 1, 4500.00);
		Product tv = new Product(null, "Super frame", 1, 5000.00);
		
		productRepository.saveAll(Arrays.asList(iphone, tv));
	}
}
