package com.example.Orderservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Orderservice.Model.Order;
import com.example.Orderservice.Repository.OrderRepo;
import com.example.Orderservice.VO.Customer;
import com.example.Orderservice.VO.ResponseTemplateVO;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public List<Order> fetchOrderList() {
		// TODO Auto-generated method stub
		return (List<Order>) orderRepo.findAll();
	}

	@Override
	public ResponseTemplateVO getOrderWithConsumer(Long id) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Order order = orderRepo.findById(id).get();
		Customer cust = restTemplate.getForObject("http://localhost:8080/api/product/read/" + order.getCustomerId(),
				Customer.class);
		vo.setConsumer(cust);
		vo.setOrder(order);
		return vo;
	}

	@Override
	public Order fetchOrderbyid(Long id) {
		// TODO Auto-generated method stub
		return orderRepo.findById(id).get();
	}

}
