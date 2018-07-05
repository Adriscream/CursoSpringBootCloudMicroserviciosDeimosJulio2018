package com.example.ejercicio;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("ConsultaProductos")
public interface ServicioConsultaProductos {
	@GetMapping("/buscar/{texto}")
	List<ProductoDto> buscarProductoPorTexto(@PathVariable String texto);
}
