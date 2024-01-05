package com.example.demo.dto;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyCrud extends JpaRepository<Person, Long> {

}
