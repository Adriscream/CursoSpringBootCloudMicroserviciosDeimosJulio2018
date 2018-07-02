package com.example.demo.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dto.Saludo;

public interface SaludosRepository extends JpaRepository<Saludo, Long> {
	List<Saludo> findByPrefijo(String prefijo);
	
	@Query("select s from Saludo s where s.sufijo = ?1")
	List<Saludo> consultaPorSufijo(String sufijo);
}
