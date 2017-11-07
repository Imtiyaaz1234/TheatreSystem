package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.Horror;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.HorrorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/horror")
public class HorrorController {

    @Autowired
    private HorrorServiceImpl horrorService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<Horror> getAllHorror()
    {
        return horrorService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addHorror(@RequestBody Horror horr){
        horrorService.create(horr);
    }

    @RequestMapping(value="/find{horrorID}")
    public @ResponseBody Horror findAudioClip(@PathVariable Long horrorID){
        return horrorService.readById(horrorID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateHorror(@RequestBody Horror horr){
        horrorService.update(horr);
    }

    @RequestMapping(value="/delete/{horrorID}",  method = RequestMethod.DELETE)
    public void deleteHorror(@PathVariable Horror horrorID){

        horrorService.delete(horrorID);
    }

}


