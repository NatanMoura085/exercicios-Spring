package br.com.codr3.exercicios_sb.model.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produtos")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private  String nome;


    public Produto(String nome){
        this.nome =nome;
    }

    public Produto(){

    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public void setId(int id){
        this.id =id;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

}
