package com.farmasystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EntityScan(basePackages = { "com.farmasystem" })
@ComponentScan(basePackages = { "com.farmasystem" })
@EnableJpaRepositories(basePackages = { "com.farmasystem" })
public class FarmaciaApplication {
	public static void main(String[] args) {
		SpringApplication.run(FarmaciaApplication.class, args);
	}
}
