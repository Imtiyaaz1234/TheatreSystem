package com.TPFinalGroupAssign.TheatreSystem.Controller;

import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;
import com.TPFinalGroupAssign.TheatreSystem.Services.Impl.MovieShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@Controller
@CrossOrigin(origins = "http://localhost")
@RequestMapping(path="/movieshow")
public class MovieShowController {

    @Autowired
    private MovieShowServiceImpl MovieShowService;

    @GetMapping(path="/all")
    public @ResponseBody
    Set<MovieShow> getAllMovieShow()
    {

        return MovieShowService.readAll();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public void addMovieShow(@RequestBody MovieShow movieShow){MovieShowService.create(movieShow);
    }

    @RequestMapping(value="/find{movieShowID}")
    public @ResponseBody MovieShow findAudioClip(@PathVariable Long movieShowID){
        return MovieShowService.readById(movieShowID);
    }

    @RequestMapping(value="/update", method = RequestMethod.PUT)
    public void updateMovieShow(@RequestBody MovieShow movieShow){
        MovieShowService.update(movieShow);
    }

    @RequestMapping(value="/delete/{movieShowID}",  method = RequestMethod.DELETE)
    public void deleteMovieShow(@PathVariable MovieShow movieShowID){

        MovieShowService.delete(movieShowID);
    }

}


