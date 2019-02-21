package com.boa.kyc.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.bofa.kyc.*")
@EnableJpaRepositories(basePackages="com.bofa.kyc.*")
@EntityScan(basePackages="com.bofa.kyc.*")
@EnableMongoRepositories(basePackages="com.bofa.kyc.*")
public class DockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
