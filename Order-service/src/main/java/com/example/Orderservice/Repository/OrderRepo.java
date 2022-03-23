package com.example.Orderservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Orderservice.Model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {



}
