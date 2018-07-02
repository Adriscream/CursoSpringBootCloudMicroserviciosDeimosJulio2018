package com.example.demo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Saludo;
import com.example.demo.repositorios.SaludosRepository;

@RestController
public class Controller {

	@Autowired
	private SaludosRepository saludoRepository;
	
	@GetMapping("/HolaMundo")
	public Saludo holaMundo(){
		return saludoRepository.findByPrefijo("Hola").get(0); 
	}
	
}
