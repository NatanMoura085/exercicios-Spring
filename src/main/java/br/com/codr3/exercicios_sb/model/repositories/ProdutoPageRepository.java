package br.com.codr3.exercicios_sb.model.repositories;

import br.com.codr3.exercicios_sb.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoPageRepository extends PagingAndSortingRepository<Produto,Integer> {
}
