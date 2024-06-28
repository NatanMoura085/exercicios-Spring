package br.com.codr3.exercicios_sb.controllers;

import br.com.codr3.exercicios_sb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Cliente")
public class ClienteController {


    @GetMapping("clients")
    public Cliente getClients(){
        return new Cliente(20L,"Natan Moura","123.144-222-22");

    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId(@PathVariable Long id){
        return new Cliente(id,"Natan Moura","3423432432");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id",defaultValue = "1") Long id){
        return new Cliente(id,"João da Silva","3432432432");

    }
}
