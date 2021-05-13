package br.com.ceolato.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ceolato.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
