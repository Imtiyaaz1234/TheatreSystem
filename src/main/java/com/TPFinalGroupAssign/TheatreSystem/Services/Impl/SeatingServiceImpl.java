package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;




import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;
import com.TPFinalGroupAssign.TheatreSystem.Domain.Seating;

import com.TPFinalGroupAssign.TheatreSystem.Repositories.SeatingRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.MovieShowService;
import com.TPFinalGroupAssign.TheatreSystem.Services.SeatingService;
import com.TPFinalGroupAssign.TheatreSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SeatingServiceImpl implements SeatingService {

    @Autowired
    private SeatingRepository repository;

    @Override
    public Seating create(Seating entity) {
        return repository.save(entity) ;
    }

    @Override
    public Seating readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Seating> readAll() {
        Iterable<Seating> seats =repository.findAll();
        Set SeatingSet = new HashSet();
        for(Seating seat:seats){
            SeatingSet.add(seat);
        }
        return SeatingSet;
    }

    @Override
    public Seating update(Seating entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Seating entity) {
        repository.delete(entity);
    }

}
