package com.TPFinalGroupAssign.TheatreSystem.Factories;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Seating;

import java.util.ArrayList;
import java.util.Map;

public class SeatingFactory {

    public static Seating getUser(Map<String, Object> values){
        Seating seatingFact = new Seating.Builder()
                .seating_id((Long)values.get("seating_id"))
                .bookings((Integer) values.get("bookings"))
                .avail((Integer) values.get("surname"))
                .seatNumber((ArrayList<Integer>)values.get("seatNumber"))
                .line((String)values.get("line"))
                .price((Integer) values.get("price"))
                .build();
        return seatingFact;
    }
}