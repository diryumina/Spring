package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetVA implements Carpet {

    private static final Map<City, BigDecimal> sqrPriceForCity = new HashMap<>();

    static{
        sqrPriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        sqrPriceForCity.put(City.ARLINGTON, new BigDecimal("2.92"));
        sqrPriceForCity.put(City.FAIRFAX, new BigDecimal("4.65"));

    }

    @Override
    public BigDecimal getSqrFtPrice(City city) {

        BigDecimal defaultValue = BigDecimal.ZERO;

       Optional<Map.Entry<City, BigDecimal>> collect = sqrPriceForCity.entrySet().stream().filter(x -> x.getKey() == city).findFirst();
        return collect.isPresent() ? collect.get().getValue() : defaultValue;
    }
}
