package br.com.ceolato.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ceolato.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
