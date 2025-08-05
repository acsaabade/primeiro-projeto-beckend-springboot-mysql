package br.com.e2etreinamentos.shoppinge2e.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.e2etreinamentos.shoppinge2e.modelo.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
