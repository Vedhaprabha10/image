package com.example.juniorprogrammer.apicrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApicrudApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(ApicrudApplication.class, args);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
