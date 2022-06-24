package com.uce.edu.demo.modelo;

public class Propietario {

	private String nombre;
	private String apellido;
	private String cedula;

	@Override
	public String toString() {
		return "Propietario [Nombre = " + nombre + ", Apellido = " + apellido + ", Cédula = " + cedula + "]";
	}

	// Set y Get
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
