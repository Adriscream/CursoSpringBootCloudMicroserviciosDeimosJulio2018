package com.example.consulta.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductosController {
	
	@Autowired
	private ProductosRepostory repository;
	
	@GetMapping("/buscar/{texto}")
	public List<ProductoDto> buscarProductoPorTexto(@PathVariable String texto){		
		return repository.findAll();
	}
}
