package com.nwm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class NetworkManagerProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(NetworkManagerProjectApplication.class, args);
		System.out.println("up and running...");
	}

}
