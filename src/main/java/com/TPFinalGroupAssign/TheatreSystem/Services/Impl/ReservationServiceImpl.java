package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Reservation;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.ReservationRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    @Override
    public Reservation create(Reservation entity) {
        return repository.save(entity) ;
    }

    @Override
    public Reservation readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Reservation> readAll() {
        Iterable<Reservation> res = repository.findAll();
        Set ReservationSet = new HashSet();
        for(Reservation re:res){
            ReservationSet.add(re);
        }
        return ReservationSet;
    }

    @Override
    public Reservation update(Reservation entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Reservation entity) {
        repository.delete(entity);
    }

}
