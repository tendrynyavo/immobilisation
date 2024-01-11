package com.immobilisation;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImmobilisationApplication {
	public static void main(String[] args) {
		SpringApplication.run(ImmobilisationApplication.class, args);
	}

}
