package com.uce.edu.demo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {

	private LocalDateTime fechaMatricula;
	private BigDecimal valorMatricula;
	private Propietario propietario;
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Matrícula [Fecha de Matrícula = " + fechaMatricula + ", Valor de Matrícula = " + valorMatricula
				+ ", Propietario = " + propietario + ", Vehículo = " + vehiculo + "]";
	}

	// Set y Get
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
