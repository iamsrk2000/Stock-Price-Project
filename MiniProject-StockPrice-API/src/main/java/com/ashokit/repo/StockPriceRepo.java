package com.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ashokit.entity.StockPrice;

@Repository
public interface StockPriceRepo extends JpaRepository<StockPrice, Integer> {

    @Query("select companyStockPrice from StockPrice where companyName = :companyName")
    public Double getStockPriceByCompanyName(String companyName);

}
