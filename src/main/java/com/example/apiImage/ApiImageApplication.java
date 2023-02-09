package com.example.apiImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiImageApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ApiImageApplication.class, args);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
