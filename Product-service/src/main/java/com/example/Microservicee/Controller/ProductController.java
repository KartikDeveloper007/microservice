package com.example.Microservicee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Microservicee.Model.Product;
import com.example.Microservicee.Service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
@Autowired
private ProductService productService;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return this.productService.save(product);
}
	@GetMapping("/read")
	public List<Product> fetchProductList() {
		return this.productService.fetchProductList();
	}
	@GetMapping("/read/{id}")
	public Product fetchProductbyid(@PathVariable("id") Long id) {
		return this.productService.fetchProductbyid(id);
	}
}