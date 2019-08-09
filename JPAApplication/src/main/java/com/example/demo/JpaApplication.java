package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		//SpringApplication.run(JpaApplication.class, args);
		SpringApplication app = new SpringApplication(JpaApplication.class);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		
	}

		
}
