package com.learnbycoding.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"com.learnbycoding"})
public class SpringBootDockerApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApp.class, args);
	}
}
