package com.TPFinalGroupAssign.TheatreSystem.Factories;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Reservation;

import java.util.ArrayList;
import java.util.Map;

public class ReservationFactory {

    public static Reservation getReservation(Map<String, Object> values){
        Reservation reservationFact = new Reservation.Builder()
                .rId((Long)values.get("rId"))
                .seatNumber((ArrayList<Integer>)values.get("seatNumber"))
                .total_price((Integer) values.get("total_price"))
                .show_id((Integer) values.get("show_id"))
                .userId((Integer)values.get("userId"))
                .build();
        return reservationFact;
    }
}