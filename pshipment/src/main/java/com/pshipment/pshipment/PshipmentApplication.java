package com.pshipment.pshipment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PshipmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PshipmentApplication.class, args);
	}

}
