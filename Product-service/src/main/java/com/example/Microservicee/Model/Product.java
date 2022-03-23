package com.example.Microservicee.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
private String name;
private String description;
private Long price;
}
