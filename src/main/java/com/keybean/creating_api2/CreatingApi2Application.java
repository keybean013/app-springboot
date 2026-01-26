package com.keybean.creating_api2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CreatingApi2Application {

	public static void main(String[] args) {
		SpringApplication.run(CreatingApi2Application.class, args);
	}

}
