package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoListApplication {

	public static void main(String[] args) {
		System.out.println("=================================started=================================");
		SpringApplication.run(TodoListApplication.class, args);
		System.out.println("=================================running=================================");


	}

}
