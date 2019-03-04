package com.springboot.junit.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.springboot.junit"})
public class JUnitLabApplication {

	public static void main(String[] args) {
		SpringApplication.run(JUnitLabApplication.class, args);
	}

}
