package com.example.ejercicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Su mision es proporcionar las funcionalidades al cliente, a base de invocaciones a servicios del cloud
@RestController
@RequestMapping("/Producto")
public class ApiGatewayController {

	@Autowired
	private ServicioConsultaProductos servicoConsultaPRoductos;
	
	@GetMapping("/buscar/{texto}")
	public List<ProductoDto> buscarProductoPorTexto(@PathVariable String texto) {
		//Dentro de este método nos podriamos encontrar una gestion de transacciones aplicando el patron saga
		//asi como la capadtacion de la respuesta esperada por el cliente a partir de la 
		//percion a varios servicios aplicando el patron composite
		return servicoConsultaPRoductos.buscarProductoPorTexto(texto);
	}

	@PostMapping("/comprar")
	public List<ProductoDto> comprarProducto() {
		return null;
	}
}
