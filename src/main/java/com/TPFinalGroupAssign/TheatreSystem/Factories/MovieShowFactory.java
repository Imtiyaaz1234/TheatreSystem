package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class MovieShowFactory {

    public static MovieShow getMovieShow(Map<String, Object> values){
        MovieShow movieShowFact = new MovieShow.Builder()
                .sId((Long)values.get("sId"))
                .mId((Integer)values.get("mId"))
                .date((Date) values.get("date"))
                .time((String) values.get("time"))
                .seatingId((Integer)values.get("seatingId"))
                .build();
        return movieShowFact;
    }
}