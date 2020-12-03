package com.cybertek.calculator;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import com.cybertek.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {


    @Qualifier("carpetTX")
    @Autowired
    private Carpet carpet;
    @Qualifier("bedroom")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(City city) throws Exception{
        BigDecimal cost = carpet.getSqrFtPrice(city).multiply(floor.getArea());

        if(cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("Not valid location");
        }
        return "Total carpet cost: " + cost;
    }
}
