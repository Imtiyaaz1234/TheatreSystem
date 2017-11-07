package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.SciFi;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.SciFiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/scifi")
public class SciFiController {

    @Autowired
    private SciFiServiceImpl sciFiService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<SciFi> getAllSciFi()
    {
        return sciFiService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addSciFi(@RequestBody SciFi sciFi){
        sciFiService.create(sciFi);
    }

    @RequestMapping(value="/find{sciFiID}")
    public @ResponseBody SciFi findAudioClip(@PathVariable Long sciFiID){
        return sciFiService.readById(sciFiID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateSciFi(@RequestBody SciFi sciFi){sciFiService.update(sciFi);
    }

    @RequestMapping(value="/delete/{sciFiID}",  method = RequestMethod.DELETE)
    public void deleteSciFi(@PathVariable SciFi sciFiID){

        sciFiService.delete(sciFiID);
    }

}


