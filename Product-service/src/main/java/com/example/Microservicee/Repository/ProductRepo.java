package com.example.Microservicee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Microservicee.Model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{

}
