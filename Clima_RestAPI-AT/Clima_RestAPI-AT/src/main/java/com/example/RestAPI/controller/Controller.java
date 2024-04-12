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

    @GetMapping("/clima")
    public String preverTempo(){
        return service.preverTempo();
    }

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> obterTodos() {
        return userService.obterTodos();
    }

    @GetMapping("/{id}")
    public UserEntity obterPorId(@PathVariable String id) {
        return userService.obterPorId(id);
    }

    @PostMapping
    public UserEntity inserir(@RequestBody UserEntity user) { return userService.inserir(user); }

    @PutMapping("/{id}")
    public UserEntity atualizar(@PathVariable String id, @RequestBody UserEntity clima) {
        return userService.atualizar(id, clima);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable String id) {
        userService.excluir(id);
    }
    // Utilizando consultas personalizadas

    //http://localhost:8080/users/buscarPorNome/jade
    @GetMapping("/buscarPorCountry/{country}")
    public List<UserEntity> buscarUsuariosPorCountry(@PathVariable String country) {
        return userService.buscarPorCountry(country);
    }
    //http://localhost:8080/users/buscarPorEmail/jade.brandao@gmail.com
    @GetMapping("/buscarPorDate/{date}")
    public List<UserEntity> buscarUsuariosPorDate(@PathVariable String date) {
        return userService.buscarPorDate(date);
    }
    //http://localhost:8080/users/buscarPorEmail/jade.brandao@gmail.com
    @GetMapping("/buscarPorText/{text}")
    public List<UserEntity> buscarUsuariosPorText(@PathVariable String text) {
        return userService.buscarPorText(text);
    }
}