package com.example.RestAPI.controller;

import com.example.RestAPI.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.RestAPI.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private UserService service;

    @GetMapping("/ibge")
    public String obteReleases(){
        return service.preverIbge();
    }

    @Autowired
    private UserService userService;




}