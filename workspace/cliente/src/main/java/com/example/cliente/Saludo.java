package com.example.cliente;

public class Saludo {

	private long id;
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
	@Override
	public String toString() {
		return "Saludo [prefijo=" + prefijo + ", nombre=" + nombre + ", sufijo=" + sufijo + "]";
	}
	public String getSufijo() {
		return sufijo;
	}
	public void setSufijo(String sufijo) {
		this.sufijo = sufijo;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Saludo() {
		super();
	}
	public Saludo(String prefijo, String nombre, String sufijo) {
		super();
		this.prefijo = prefijo;
		this.nombre = nombre;
		this.sufijo = sufijo;
	}
	
	
}
