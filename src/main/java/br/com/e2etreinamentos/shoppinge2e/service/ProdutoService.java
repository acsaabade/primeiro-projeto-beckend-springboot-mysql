package br.com.e2etreinamentos.shoppinge2e.service;

import org.springframework.stereotype.Service;

import br.com.e2etreinamentos.shoppinge2e.modelo.Produto;
import br.com.e2etreinamentos.shoppinge2e.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository repository;

	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;

	}

	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}

}
