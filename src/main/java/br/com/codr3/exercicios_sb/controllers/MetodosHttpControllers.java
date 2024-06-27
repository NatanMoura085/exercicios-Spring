package br.com.codr3.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpControllers {

    @GetMapping
    public String get(){
        return "Requisição Get";
    }

    @PostMapping
    public String post(){
        return "Requisição  Post";
    }

    @PutMapping
    public String put(){
        return "Requisição Put";
    }
    @PatchMapping
    public String path(){
        return "Requisição Path";
    }
    @DeleteMapping
    public String delete(){
        return "Requisição Delete";
    }
}
