package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.Seating;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.SeatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/seating")
public class SeatingController {

    @Autowired
    private SeatingServiceImpl seatingService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Seating> getAllSeating()
    {
        return seatingService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addSeat(@RequestBody Seating seating){
        seatingService.create(seating);
    }

    @RequestMapping(value="/find{seatingID}")
    public @ResponseBody Seating findAudioClip(@PathVariable Long seatingID){
        return seatingService.readById(seatingID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateSeating(@RequestBody Seating seating){
        seatingService.update(seating);
    }

    @RequestMapping(value="/delete/{seatingID}",  method = RequestMethod.DELETE)
    public void deleteSeating(@PathVariable Seating seatingID){

        seatingService.delete(seatingID);
    }

}


