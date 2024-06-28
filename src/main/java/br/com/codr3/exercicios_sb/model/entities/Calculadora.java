package br.com.codr3.exercicios_sb.model.entities;

public class Calculadora {
private Double result;
    public Calculadora(){


    }

    public Double somar(double numero1, double numero2) {
        return this.result = numero1+ numero2;
    }

    public Double subs(double numero1 ,double numero2){
        return this.result = numero1 -numero2;
    }

    public Double getResult(){
        return result;
    }
}
