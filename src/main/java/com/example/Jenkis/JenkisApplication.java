package com.example.Jenkis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkisApplication.class, args);
		System.out.println("It is a continuous integration job");
	}
}
