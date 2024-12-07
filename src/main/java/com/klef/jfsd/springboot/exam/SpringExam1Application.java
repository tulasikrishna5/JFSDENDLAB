package com.klef.jfsd.springboot.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringExam1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringExam1Application.class, args);
		System.out.println("Project is Running ...!!!");
	}
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
