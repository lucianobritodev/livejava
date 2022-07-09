package com.lucianobrito.livejava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucianobrito.livejava.entities.Produto;
import com.lucianobrito.livejava.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	public Produto findById(Long id) {
		return repository.findById(id).get();
	}
	
}
