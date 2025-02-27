package com.example.uttkarsh.Basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicsApplication implements CommandLineRunner {

	@Autowired   //DI to call bean
	private Animal dog;

	public static void main(String[] args) {
		SpringApplication.run(BasicsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		dog.speak();
	}
}
