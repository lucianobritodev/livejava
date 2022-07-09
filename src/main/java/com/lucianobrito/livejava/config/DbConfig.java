package com.lucianobrito.livejava.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucianobrito.livejava.entities.Produto;
import com.lucianobrito.livejava.repositories.ProdutoRepository;

@Configuration
public class DbConfig implements CommandLineRunner {
	
	@Autowired
	private ProdutoRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		Produto p = new Produto(null, "Computador", "Eletronico", 3000d, new Date(1846731925L), new Date());
		
		String nome = repository.save(p).getNome();
		
		
		System.out.println(repository.getByNome(nome));
	}

}
