package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.SciFi;


import java.util.Map;

public class SciFiFactory {

    public static SciFi getSciFi(Map<String, Object> values){
        SciFi scifiFact = new SciFi.Builder()
                .movieId((Long)values.get("movieId"))
                .duration((Integer)values.get("duration"))
                .title((String) values.get("title"))
                .build();
        return scifiFact;
    }
}