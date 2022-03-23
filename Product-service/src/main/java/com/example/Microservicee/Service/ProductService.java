package com.example.Microservicee.Service;

import java.util.List;

import com.example.Microservicee.Model.Product;

public interface ProductService {

	public Product save(Product product);
	public List<Product> fetchProductList();
	public Product fetchProductbyid(Long id);
}
