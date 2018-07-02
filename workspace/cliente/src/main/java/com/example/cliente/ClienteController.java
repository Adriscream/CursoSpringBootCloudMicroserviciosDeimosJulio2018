package com.example.cliente;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/ConsumirServicioRemoto")
	public String consumirServicioRemoto() throws RestClientException, URISyntaxException{
		
		 ResponseEntity<Saludo> respuesta = restTemplate.getForEntity(new URI("http://localhost:8090/HolaMundo"), Saludo.class);
		
		return respuesta.getBody().toString();
	}
	
}
