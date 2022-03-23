package com.example.Microservicee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Microservicee.Model.Product;
import com.example.Microservicee.Repository.ProductRepo;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productRepo;
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> fetchProductList() {
		// TODO Auto-generated method stub
		return (List<Product>) productRepo.findAll();
	}

	@Override
	public Product fetchProductbyid(Long id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).get();
	}

}
