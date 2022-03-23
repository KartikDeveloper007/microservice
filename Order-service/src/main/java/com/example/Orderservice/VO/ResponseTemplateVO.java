package com.example.Orderservice.VO;

import com.example.Orderservice.Model.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
private Order order;
private Customer consumer;
}
