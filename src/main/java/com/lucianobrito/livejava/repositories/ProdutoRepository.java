package com.lucianobrito.livejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lucianobrito.livejava.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query(value = "select p from Produto p where p.nome = :nome")
	Produto getByNome(@Param("nome") String nome);

}
