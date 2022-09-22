package com.example.hrbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.hrbackend"})
@EnableJpaRepositories(basePackages = {"com.example.hrbackend"})
@EntityScan(basePackages = {"com.example.hrbackend"})
public class HrbackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrbackendApplication.class, args);
	}

}
