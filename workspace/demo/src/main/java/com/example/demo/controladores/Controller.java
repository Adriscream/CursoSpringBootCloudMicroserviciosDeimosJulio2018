package com.example.demo.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Saludo;

@RestController
public class Controller {

	@GetMapping("/HolaMundo")
	public Saludo holaMundo(){
		return new Saludo("Hola", "Mundo", "!!!!!");
	}
	
}
