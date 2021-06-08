package br.com.spindola.unicesumar.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.spindola.unicesumar.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	
}
