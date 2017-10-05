package com.dental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.dental")

public class DentalApplication {
	
	


	public static void main(String[] args) {
	
		SpringApplication.run(DentalApplication.class, args);

	}
	

}
