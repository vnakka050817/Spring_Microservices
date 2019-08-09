package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class Demo1Application implements CommandLineRunner{

	@Autowired
	UserRepository ur;
	public static void main(String[] args) {
		//SpringApplication.run(Demo1Application.class, args);
		SpringApplication app = new SpringApplication(Demo1Application.class);
		app.run(args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
		ur.save(new User(1, "Suresh", 9741435599));
		ur.save(new User(2, "11", 9741435599));
		ur.save(new User(3, "22", 9741435599));
		
		User u1 = ur.findById(2).get();
		System.out.println(u1);
	}
}
