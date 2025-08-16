package com.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.bindings.StockCalcAPIResponse;
import com.ashokit.service.StockCalcService;

@RestController
public class StockCalcRestController {
	
	@Autowired
	private StockCalcService calcService;
	
	@GetMapping("/calc/{companyName}/{quantity}")
	private StockCalcAPIResponse getStocsCost(@PathVariable String companyName,@PathVariable Integer quantity) {
		return calcService.getStocksCost(companyName, quantity);
	}

}
