package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class ProductDAO {
	
private static Map<Integer,Product> products;
	
	static {
		products = new HashMap<Integer, Product>();
		products.put(1, new Product(1,"Phone","Sony"));
		products.put(2, new Product(2,"WashingMachine","IFB"));
		products.put(3, new Product(3,"Camera","Nikon"));
		
	}
	
	
	public Product get(int id) {
		return products.get(id);
	}
	

}
