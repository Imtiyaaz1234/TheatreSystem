package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Horror;
import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class HorrorFactory {

    public static Horror getHorror(Map<String, Object> values){
        Horror HorrorFact = new Horror.Builder()
                .movieId((Long)values.get("movieId"))
                .duration((Integer)values.get("duration"))
                .title((String) values.get("time"))
                .build();
        return HorrorFact;
    }
}