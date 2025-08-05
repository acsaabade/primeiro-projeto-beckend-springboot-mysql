package br.com.e2etreinamentos.shoppinge2e.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.e2etreinamentos.shoppinge2e.modelo.Produto;
import br.com.e2etreinamentos.shoppinge2e.service.ProdutoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {

	private final ProdutoService service;

	public ProdutoController(ProdutoService service) {
		this.service = service;

	}

	@PostMapping
	public ResponseEntity<?> criar(@Valid @RequestBody Produto produto) {

		return ResponseEntity.ok(service.salvar(produto));

	}
}
