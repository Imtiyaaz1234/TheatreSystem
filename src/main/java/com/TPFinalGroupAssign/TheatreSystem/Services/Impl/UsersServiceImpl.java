package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;



import com.TPFinalGroupAssign.TheatreSystem.Domain.Users;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.UserRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UsersServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Users create(Users entity) {
        return repository.save(entity) ;
    }

    @Override
    public Users readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Users> readAll() {
        Iterable<Users> users =repository.findAll();
        Set UsersSet = new HashSet();
        for(Users user:users){
            UsersSet.add(user);
        }
        return UsersSet;
    }

    @Override
    public Users update(Users entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Users entity) {
        repository.delete(entity);
    }

}
