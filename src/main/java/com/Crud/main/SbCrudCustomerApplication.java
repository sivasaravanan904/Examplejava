 package com.Crud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.Crud")
@EntityScan("com.Crud.model")
@EnableJpaRepositories("com.crud.repository")
public class SbCrudCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCrudCustomerApplication.class, args);
	}

}
