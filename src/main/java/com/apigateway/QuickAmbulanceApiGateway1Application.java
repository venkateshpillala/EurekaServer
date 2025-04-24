package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class QuickAmbulanceApiGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(QuickAmbulanceApiGateway1Application.class, args);
	}

}
