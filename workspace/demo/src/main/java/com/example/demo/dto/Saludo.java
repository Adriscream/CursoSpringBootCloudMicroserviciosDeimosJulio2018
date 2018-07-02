package com.example.demo.dto;

public class Saludo {

	private String prefijo;
	private String nombre;
	private String sufijo;
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSufijo() {
		return sufijo;
	}
	public void setSufijo(String sufijo) {
		this.sufijo = sufijo;
	}
	public Saludo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Saludo(String prefijo, String nombre, String sufijo) {
		super();
		this.prefijo = prefijo;
		this.nombre = nombre;
		this.sufijo = sufijo;
	}
	
	
}
