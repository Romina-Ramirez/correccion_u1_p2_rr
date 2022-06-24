package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se creó el propietario de vehículo: " + p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se eliminó el propietario de vehículo con cédula: " + cedula);
	}

	@Override
	public Propietario leer(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setNombre("Romina");
		p.setApellido("Ramírez");
		p.setCedula(cedula);
		return p;
	}

}
