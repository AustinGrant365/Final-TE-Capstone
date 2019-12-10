package com.techelevator.finalcapstonespringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaAuditing
@EntityScan(basePackages = {"com.techelevator.finalcapstonespringboot.model"})
@EnableJpaRepositories(basePackages = {"com.techelevator.finalcapstonespringboot.repository"})
public class FinalCapstoneSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalCapstoneSpringbootApplication.class, args);
	}

}
