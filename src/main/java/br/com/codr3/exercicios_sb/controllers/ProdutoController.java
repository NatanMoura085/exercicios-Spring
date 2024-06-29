package br.com.codr3.exercicios_sb.controllers;

import br.com.codr3.exercicios_sb.model.entities.Produto;
import br.com.codr3.exercicios_sb.model.repositories.ProdutoPageRepository;
import br.com.codr3.exercicios_sb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ProdutoPageRepository produtoPageRepository;
    @RequestMapping(method = {RequestMethod.POST,RequestMethod.PUT})
    public @ResponseBody Produto novoProduto(@Valid  @RequestParam String nome,@RequestParam double preco, @RequestParam double desconto){
        Produto produto = new Produto(nome,preco,desconto);
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterTodosProdutos(){
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/{numeroPaginas}/{qtde}")
    public Iterable<Produto> obterProdutosPorPaginas(@PathVariable int numeroPaginas,@PathVariable int qtde){
        if (numeroPaginas >=5) qtde =5;
        Pageable page = PageRequest.of(numeroPaginas,qtde);
        return produtoPageRepository.findAll(page);
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorParteNome(@PathVariable String parteNome){
        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id){
        return produtoRepository.findById(id);
    }


    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id){
         produtoRepository.deleteById(id);
    }
}
