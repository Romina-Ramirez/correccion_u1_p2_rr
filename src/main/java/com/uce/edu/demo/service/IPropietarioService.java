package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioService {

	public void insertarPropietario(Propietario p);

	public void eliminarPropietario(String cedula);

}
