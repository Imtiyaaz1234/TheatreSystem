package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Horror;
import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.HorrorRepository;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.MovieShowRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.HorrorService;
import com.TPFinalGroupAssign.TheatreSystem.Services.MovieShowService;
import com.TPFinalGroupAssign.TheatreSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MovieShowServiceImpl implements MovieShowService {

    @Autowired
    private MovieShowRepository repository;

    @Override
    public MovieShow create(MovieShow entity) {
        return repository.save(entity) ;
    }

    @Override
    public MovieShow readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<MovieShow> readAll() {
        Iterable<MovieShow> shows =repository.findAll();
        Set MovieShowSet = new HashSet();
        for(MovieShow show:shows){
            MovieShowSet.add(show);
        }
        return MovieShowSet;
    }

    @Override
    public MovieShow update(MovieShow entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(MovieShow entity) {
        repository.delete(entity);
    }

}
