package br.com.codr3.exercicios_sb.controllers;

import br.com.codr3.exercicios_sb.model.entities.Produto;
import br.com.codr3.exercicios_sb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @PostMapping
    public @ResponseBody Produto novoProduto(@RequestParam String nome){
        Produto produto = new Produto(nome);
        produtoRepository.save(produto);
        return produto;
    }

}
