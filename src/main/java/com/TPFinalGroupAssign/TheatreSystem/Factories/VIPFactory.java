package com.TPFinalGroupAssign.TheatreSystem.Factories;

import com.TPFinalGroupAssign.TheatreSystem.Domain.VIP;

import java.util.Map;

public class VIPFactory {
    public static VIP getVIP(Map<String, Object> values){
        VIP vipFact = new VIP.Builder()
                .class_name((String)values.get("class_name"))
                .price((Integer) values.get("price"))
                .seat_id((Long) values.get("seat_id"))
                .build();
        return vipFact;
    }
}
