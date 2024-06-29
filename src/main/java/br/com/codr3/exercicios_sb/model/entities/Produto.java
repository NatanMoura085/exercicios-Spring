package br.com.codr3.exercicios_sb.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private  String nome;
    @Min(0)
    private double preco;
    @Min(0)
    @Max(1)
    private  double desconto;


    public Produto(String nome,double preco,double desconto){
        this.nome =nome;
        this.preco = preco;
        this.setDesconto(desconto);


    }



    public Produto(){

    }



    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }
    public  void setDesconto(double desconto){
        double valorDesconto = this.preco * (desconto / 100);


        this.preco = this.preco - valorDesconto;
    }

    public void setId(int id){
        this.id =id;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

}
