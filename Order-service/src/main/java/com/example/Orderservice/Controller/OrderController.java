package com.example.Orderservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Orderservice.Model.Order;
import com.example.Orderservice.Service.OrderService;
import com.example.Orderservice.VO.ResponseTemplateVO;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
private OrderService orderService;

	@PostMapping("/save")
	public Order save(@RequestBody Order order) {
		 return this.orderService.save(order);
	}
	@GetMapping("/read")
	public List<Order> fetchOrderList() {
		return this.orderService.fetchOrderList();
	}
	@GetMapping("/read/{id}")
	public Order fetchProductbyid(@PathVariable("id") Long id) {
		return this.orderService.fetchOrderbyid(id);
	}
	@GetMapping("/read/consumer/{id}")
	public ResponseTemplateVO getOrderWithConsumer(@PathVariable("id") Long id) {
		return orderService.getOrderWithConsumer(id);
	}
}
