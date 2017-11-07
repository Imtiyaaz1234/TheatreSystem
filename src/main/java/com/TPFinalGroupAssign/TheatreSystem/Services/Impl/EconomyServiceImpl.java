package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Admin;
import com.TPFinalGroupAssign.TheatreSystem.Domain.Economy;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.EconomyRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.EcoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class EconomyServiceImpl implements EcoService {

    @Autowired
    private EconomyRepository repository;

    @Override
    public Economy create(Economy entity) {
        return repository.save(entity) ;
    }

    @Override
    public Economy readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Economy> readAll() {
        Iterable<Economy> ecos = repository.findAll();
        Set EconomySet = new HashSet();
        for(Economy eco:ecos){
            EconomySet.add(eco);
        }
        return EconomySet;
    }

    @Override
    public Economy update(Economy entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Economy entity) {
        repository.delete(entity);
    }

}
