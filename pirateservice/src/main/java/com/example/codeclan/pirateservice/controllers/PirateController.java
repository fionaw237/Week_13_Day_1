package com.example.codeclan.pirateservice.controllers;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pirates")
public class PirateController {

    @Autowired
    PirateRepository pirateRepository;

    @GetMapping
    public List<Pirate> getAllPirates(){
        return pirateRepository.findAll();
    }

    @PostMapping
    public void setPirateRepository(){

    }
}
