package com.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ashokit.bindings.StockPriceAPIResponse;

@FeignClient(name="STOCK-PRICE-API")
public interface StockPriceClient {
	
	@GetMapping("/price/{companyName}")
	public StockPriceAPIResponse invokeStockPriceApi(@PathVariable String companyName);

}
