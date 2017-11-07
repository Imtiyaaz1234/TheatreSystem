package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.Economy;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.EconomyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/economy")
public class EconomyController {

    @Autowired
    private EconomyServiceImpl economyService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Economy> getAllEconomy()
    {
        return economyService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addEconomy(@RequestBody Economy eco){
        economyService.create(eco);
    }

    @RequestMapping(value="/find{economyID}")
    public @ResponseBody Economy findAudioClip(@PathVariable Long economyID){
        return economyService.readById(economyID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateEconomy(@RequestBody Economy eco){
        economyService.update(eco);
    }

    @RequestMapping(value="/delete/{economyID}",  method = RequestMethod.DELETE)
    public void deleteEconomy(@PathVariable Economy economyID){

        economyService.delete(economyID);
    }

}


