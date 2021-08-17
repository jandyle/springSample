package com.example.springSample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSampleApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		return application.sources(SpringSampleApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSampleApplication.class, args);
	}

	@RequestMapping(value = "/")
	public String hello(){
		return "Hello World";
	}

	@RequestMapping(value = "/too")
	public String pap(){
		return "wp";
	}


}
