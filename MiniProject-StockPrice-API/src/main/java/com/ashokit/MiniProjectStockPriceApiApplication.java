package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MiniProjectStockPriceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectStockPriceApiApplication.class, args);
	}

}
