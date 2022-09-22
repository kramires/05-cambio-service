package br.com.klaytonramires.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.klaytonramires.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
	
	Cambio findByFromAndTo(String from, String to);

}
