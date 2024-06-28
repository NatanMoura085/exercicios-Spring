package br.com.codr3.exercicios_sb.controllers;

import br.com.codr3.exercicios_sb.model.entities.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("calculadora")
public class CalculadoraController {



    @GetMapping(path = "/somar/{a}/{b}")
    public Calculadora somar(@PathVariable double a, @PathVariable double b){
        Calculadora calculadora = new Calculadora();
        calculadora.somar(a,b);
        return calculadora;
    }

    @GetMapping("subtrair")
    public Calculadora subtrair(@RequestParam(name = "a") double a , @RequestParam(name="b") double b){
        Calculadora calculadora = new Calculadora();
        calculadora.subs(a,b);
        return calculadora;
    }

}
