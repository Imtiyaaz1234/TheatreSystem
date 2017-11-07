package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;



import com.TPFinalGroupAssign.TheatreSystem.Domain.MovieShow;
import com.TPFinalGroupAssign.TheatreSystem.Domain.VIP;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.MovieShowRepository;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.VIPRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.MovieShowService;
import com.TPFinalGroupAssign.TheatreSystem.Services.UserService;
import com.TPFinalGroupAssign.TheatreSystem.Services.VIPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class VIPServiceImpl implements VIPService {

    @Autowired
    private VIPRepository repository;

    @Override
    public VIP create(VIP entity) {
        return repository.save(entity) ;
    }

    @Override
    public VIP readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<VIP> readAll() {
        Iterable<VIP> vips =repository.findAll();
        Set VIPSet = new HashSet();
        for(VIP vip:vips){
            VIPSet.add(vip);
        }
        return VIPSet;
    }

    @Override
    public VIP update(VIP entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(VIP entity) {
        repository.delete(entity);
    }

}
