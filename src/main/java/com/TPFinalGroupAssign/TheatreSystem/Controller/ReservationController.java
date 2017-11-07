package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.Reservation;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.ReservationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/reservation")
public class ReservationController {

    @Autowired
    private ReservationServiceImpl reservationService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Reservation> getAllReservation()
    {

        return reservationService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addReservation(@RequestBody Reservation reservation){
        reservationService.create(reservation);
    }

    @RequestMapping(value="/find{reservationID}")
    public @ResponseBody Reservation findAudioClip(@PathVariable Long reservationID){
        return reservationService.readById(reservationID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateReservation(@RequestBody Reservation reservation){
        reservationService.update(reservation);
    }

    @RequestMapping(value="/delete/{reservationID}",  method = RequestMethod.DELETE)
    public void deleteReservation(@PathVariable Reservation reservationID){

        reservationService.delete(reservationID);
    }

}


