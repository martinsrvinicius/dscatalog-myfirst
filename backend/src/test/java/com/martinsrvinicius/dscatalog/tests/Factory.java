package com.martinsrvinicius.dscatalog.tests;

import java.time.Instant;

import com.martinsrvinicius.dscatalog.dto.ProductDTO;
import com.martinsrvinicius.dscatalog.entities.Category;
import com.martinsrvinicius.dscatalog.entities.Product;

public class Factory {
	
	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Good Phone", 800.0, "https://img.com/img.com", Instant.parse("2024-01-15T12:06:00Z"));
		product.getCategories().add(createCategory());
		return product;
	}

	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}

	public static Category createCategory() {
		return new Category(1L, "Eletronics");
	}
}
