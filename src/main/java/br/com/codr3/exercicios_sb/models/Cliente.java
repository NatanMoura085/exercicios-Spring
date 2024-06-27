package br.com.codr3.exercicios_sb.models;

public class Cliente {
    private Long id;
    private String nome;
    private String cpf;

    public Cliente(Long id,String nome, String cpf){
        this.id = id;
        this.nome = nome;
        this.cpf =cpf;

    }


    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome =nome;
    }

    public void setCpf(String cpf){
        this.cpf =cpf;
    }


}
