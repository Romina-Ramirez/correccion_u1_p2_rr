package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void insertarVehiculo(Vehiculo v);

	public Vehiculo buscarVehiculo(String placa);

	public void actualizarVehiculo(Vehiculo v);

	public void eliminarVehiculo(String placa);

}
