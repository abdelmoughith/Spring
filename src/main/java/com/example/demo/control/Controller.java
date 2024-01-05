package com.example.demo.control;

import com.example.demo.model.Person;
import com.example.demo.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    public final MyService service;

    public Controller(MyService service) {
        this.service = service;
    }
    @PostMapping("/register")
    public String createPerson(@RequestBody Person person){
        service.savePerson(person);
        return person.getFirst_name() + " registred successfully";
    }
    @GetMapping("/get")
    public String getter(){
        return "test passed !";
    }
}
