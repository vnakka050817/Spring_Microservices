package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example")
public class JpAapplication1Application {

	@Autowired
	UserRepository ur;
	public static void main(String[] args) {
		//SpringApplication.run(Demo1Application.class, args);
		SpringApplication app = new SpringApplication(JpAapplication1Application.class);
		app.run(args);
	}

	
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		ur.save(new User(1, "Suresh", 97414599));
		ur.save(new User(2, "11", 97414599));
		ur.save(new User(3, "22", 97414599));
		
		User u1 = (ur.findById(2)).get();
		System.out.println(ur);
	}
}
