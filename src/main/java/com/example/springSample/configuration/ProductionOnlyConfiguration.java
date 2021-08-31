package com.example.springSample.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("prod")
public class ProductionOnlyConfiguration {
	@Bean
	public String dummy() {
		return "something";
	}
}
