package com.TPFinalGroupAssign.TheatreSystem.Services.Impl;


import com.TPFinalGroupAssign.TheatreSystem.Domain.Documentary;
import com.TPFinalGroupAssign.TheatreSystem.Repositories.DocumentaryRepository;
import com.TPFinalGroupAssign.TheatreSystem.Services.DocumentaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class DocumentaryServiceImpl implements DocumentaryService {

    @Autowired
    private DocumentaryRepository repository;

    @Override
    public Documentary create(Documentary entity) {
        return repository.save(entity) ;
    }

    @Override
    public Documentary readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Set<Documentary> readAll() {
        Iterable<Documentary> docs = repository.findAll();
        Set DocumentarySet = new HashSet();
        for(Documentary doc:docs){
            DocumentarySet.add(doc);
        }
        return DocumentarySet;
    }

    @Override
    public Documentary update(Documentary entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Documentary entity) {
        repository.delete(entity);
    }

}
