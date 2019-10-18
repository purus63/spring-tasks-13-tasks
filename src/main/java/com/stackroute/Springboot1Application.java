package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class Springboot1Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Springboot1Application.class, args);
	}

}
