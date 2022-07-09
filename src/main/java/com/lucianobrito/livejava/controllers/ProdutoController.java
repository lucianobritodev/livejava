package com.lucianobrito.livejava.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucianobrito.livejava.entities.Produto;
import com.lucianobrito.livejava.services.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable("id") Long id) {
		Produto p = service.findById(id);
		return ResponseEntity.ok().body(p);
	}
	
}
