package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.bindings.StockPriceResponse;
import com.ashokit.repo.StockPriceRepo;

@Service
public class StockPriceService {
	
	@Autowired
	private StockPriceRepo stockPriceRepo;
	
	@Autowired
	private org.springframework.core.env.Environment env;
	
	public StockPriceResponse getStockPrice(String companyName) {
		    Double stockPrice = stockPriceRepo.getStockPriceByCompanyName(companyName);
		   StockPriceResponse response = new StockPriceResponse();
		   response.setCompanyName(companyName);
		   response.setCompanyStockPrice(stockPrice);
		   String port = env.getProperty("server.port");
		   response.setPortNumber(Integer.parseInt(port));
		   
		   return response;
	}

}

