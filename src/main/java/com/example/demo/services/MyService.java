package com.example.demo.services;

import com.example.demo.dto.MyCrud;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Autowired
    public final MyCrud crud;

    public MyService(MyCrud crud) {
        this.crud = crud;
    }
    public void savePerson(Person person){
        crud.save(person);
    }
}
