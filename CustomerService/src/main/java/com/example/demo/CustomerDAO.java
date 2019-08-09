package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {
private static Map<Integer,Customer> customers;
	
	static {
		
		customers = new HashMap<Integer, Customer>();
		customers.put(1, new Customer(1,"Suresh","Whitefield"));
		customers.put(2, new Customer(2,"Ramesh","ITPL"));
		customers.put(3, new Customer(3,"Sundar","KRPURAM"));
		
	}
	
	
	public Customer get(int id) {
		return customers.get(id);
	}
	

}
