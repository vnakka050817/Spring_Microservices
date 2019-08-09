package com.example.demo;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
	public ResponseEntity getproduct(@PathVariable("id") Integer id) {
		
		Product product = productDAO.get(id);
		if(product == null) {
			return new ResponseEntity("No prod found" +id,HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity(product,HttpStatus.OK);
	}
}
