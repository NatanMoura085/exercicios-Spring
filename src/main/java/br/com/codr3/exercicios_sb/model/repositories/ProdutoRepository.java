package br.com.codr3.exercicios_sb.model.repositories;

import br.com.codr3.exercicios_sb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto,Integer> {
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
}
