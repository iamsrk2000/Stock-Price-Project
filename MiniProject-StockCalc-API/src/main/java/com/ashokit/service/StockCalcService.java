package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.StockCalcAPIResponse;
import com.ashokit.bindings.StockPriceAPIResponse;
import com.ashokit.client.StockPriceClient;

@Service
public class StockCalcService {
     
	@Autowired
	private StockPriceClient priceClient;
	
	public StockCalcAPIResponse getStocksCost(String companyName, Integer quantity) {
		  StockPriceAPIResponse priceResponse= priceClient.invokeStockPriceApi(companyName);
		  StockCalcAPIResponse response = new StockCalcAPIResponse();
		  Double companyStockPrice = priceResponse.getCompanyStockPrice();
		  Double totalCost = companyStockPrice*quantity;
		  StockCalcAPIResponse calcResponse = new StockCalcAPIResponse();
		  calcResponse.setCompanyName(companyName);
		  calcResponse.setQuantity(quantity);
		  calcResponse.setTotalCost(totalCost);
		  calcResponse.setPortNumber(priceResponse.getPortNumber());
		  
		  return calcResponse;
		  
	}
}
