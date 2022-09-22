package br.com.klaytonramires;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.klaytonramires.repository.CambioRepository;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "br.com.klaytonramires.repository")
//@EntityScan(basePackages = "br.com.klaytonramires.model") 
public class Application {
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
