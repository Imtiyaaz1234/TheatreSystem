package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.VIP;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.VIPServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/vip")
public class VIPController {

    @Autowired
    private VIPServiceImpl VIPService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<VIP> getAllVIP()
    {
        return VIPService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addVIP(@RequestBody VIP vip){
        VIPService.create(vip);
    }

    @RequestMapping(value="/find{vipID}")
    public @ResponseBody VIP findAudioClip(@PathVariable Long vipID){
        return VIPService.readById(vipID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateVIP(@RequestBody VIP vip){
        VIPService.update(vip);
    }

    @RequestMapping(value="/delete/{vipID}",  method = RequestMethod.DELETE)
    public void deleteVIP(@PathVariable VIP vipID){

        VIPService.delete(vipID);
    }

}


