package com.examly.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.examly.model"}) 
public class SpringappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringappApplication.class, args);
	}

}
