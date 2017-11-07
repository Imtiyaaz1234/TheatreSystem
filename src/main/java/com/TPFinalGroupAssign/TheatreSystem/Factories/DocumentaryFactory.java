package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Documentary;
import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class DocumentaryFactory {

    public static Documentary getDocumentary(Map<String, Object> values){
        Documentary documentaryFact = new Documentary.Builder()
                .movie_id((Long)values.get("movieId"))
                .duration((Integer)values.get("duration"))
                .title((String) values.get("title"))
                .build();
        return documentaryFact;
    }
}