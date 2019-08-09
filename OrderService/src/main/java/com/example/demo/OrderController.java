package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	@Autowired
	private RestTemplate restTemplate;
	private long id =1;
	@RequestMapping("order")
	public Order SubmitOrder(
			@RequestParam("customerId") long customerId,
			@RequestParam("productId") long productId,
			@RequestParam("amount") long amount){
				
			
			Order order = new Order();
			String customerUrl = "http://localhost:8081/customers/{id}";
			String productUrl = "http://localhost:8082/products/{id}";
			
			Customer customer = restTemplate.getForObject(customerUrl,Customer.class,customerId);
			Product product = restTemplate.getForObject(productUrl,Product.class,productId);
			order.setCustomer(customer);
			order.setProduct(product);
			order.setId(id);
			order.setAmount(amount);
			order.setDateOrder(new Date());
			id++;
			return order;
					
			}

}
