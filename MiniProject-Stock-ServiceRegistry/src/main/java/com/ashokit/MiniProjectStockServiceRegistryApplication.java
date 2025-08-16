package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MiniProjectStockServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectStockServiceRegistryApplication.class, args);
	}

}
