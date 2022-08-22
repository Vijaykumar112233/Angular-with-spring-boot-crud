package com.example.angularwithcurd.service;

import com.example.angularwithcurd.entity.AngularEntity;
import com.example.angularwithcurd.repository.AngularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AngularService {

    @Autowired
    private AngularRepository angularRepository;

    public List<AngularEntity> getAllList(){
        return angularRepository.findAll();
    }

    public AngularEntity insertEmp(AngularEntity emp){
        return angularRepository.save(emp);
    }

    public AngularEntity empById(Long id) {
        return angularRepository.findById(id).get();
    }

    public void deleteEmp(AngularEntity emp) {
        angularRepository.delete(emp);
    }
}
