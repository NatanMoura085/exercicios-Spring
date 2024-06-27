package br.com.codr3.exercicios_sb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
    @GetMapping(path = {"/","/ola"})
    public String primeiroControllers(){
        return "Olá Spring-boot";
    }
}
