package com.ranjan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMainApplication.class, args);
	}
}
