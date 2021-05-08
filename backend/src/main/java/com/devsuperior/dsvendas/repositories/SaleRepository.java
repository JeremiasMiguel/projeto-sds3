package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Sale;

// Responsável por acessar os dados, já tem a implementação de inserir, editar, remover.
// Já possui diversos métodos implementados, findAll, delete, count...

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
