package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.dto.Saludo;
import com.example.demo.repositorios.SaludosRepository;

@Configuration
public class Configuracion {
	@Bean
	public CommandLineRunner demo(SaludosRepository repository) {
		return (args) -> {
			repository.save(new Saludo("Hola", "Mundo", "!!!!"));
			repository.save(new Saludo("Adios", "Mundo", "cruel"));
		};
	}
}
