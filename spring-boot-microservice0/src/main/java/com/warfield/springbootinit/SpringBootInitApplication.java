package com.warfield.springbootinit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootInitApplication {

	@Bean
	@Lazy
	public RestTemplate getRestTemplate(){
		System.out.println("singleton rest template thru bean");
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootInitApplication.class, args);
	}

}
