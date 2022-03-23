package com.example.Orderservice.Service;

import java.util.List;

import com.example.Orderservice.Model.Order;
import com.example.Orderservice.VO.ResponseTemplateVO;

public interface OrderService {
	public Order save(Order order);
	public List<Order> fetchOrderList();
	public Order fetchOrderbyid(Long id);
	public ResponseTemplateVO getOrderWithConsumer(Long id);

}
