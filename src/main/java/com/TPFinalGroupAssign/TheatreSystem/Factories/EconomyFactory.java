package com.TPFinalGroupAssign.TheatreSystem.Factories;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Economy;

import java.util.Map;

public class EconomyFactory {

    public static Economy getEconomy(Map<String, Object> values){
        Economy economyFact = new Economy.Builder()
                .seat_id((Long)values.get("seat_id"))
                .class_name((String)values.get("class_name"))
                .price((Integer) values.get("price"))
                .build();
        return economyFact;
    }
}