package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;



import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;
import com.TPFinalGroupAssign.TheatreSystem.Domain.SciFi;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.MovieShowRepository;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.SciFiRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.MovieShowService;
import com.TPFinalGroupAssign.TheatreSystem.Services.SciFiService;
import com.TPFinalGroupAssign.TheatreSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class SciFiServiceImpl implements SciFiService {

    @Autowired
    private SciFiRepository repository;

    @Override
    public SciFi create(SciFi entity) {
        return repository.save(entity) ;
    }

    @Override
    public SciFi readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<SciFi> readAll() {
        Iterable<SciFi> sciFis = repository.findAll();
        Set SciFiSet = new HashSet();
        for(SciFi sci:sciFis){
            SciFiSet.add(sci);
        }
        return SciFiSet;
    }

    @Override
    public SciFi update(SciFi entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(SciFi entity) {
        repository.delete(entity);
    }

}
