package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class SpringbootjpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjpaCrudApplication.class, args);
	}

}
