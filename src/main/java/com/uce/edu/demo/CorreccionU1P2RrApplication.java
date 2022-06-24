package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.service.IMatriculaGestorService;
import com.uce.edu.demo.service.IPropietarioService;
import com.uce.edu.demo.service.IVehiculoService;

@SpringBootApplication
public class CorreccionU1P2RrApplication implements CommandLineRunner{
	
	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IMatriculaGestorService gestorService;

	public static void main(String[] args) {
		SpringApplication.run(CorreccionU1P2RrApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("1. Crear un propietario.");
		Propietario propietario = new Propietario();
		propietario.setNombre("Mina");
		propietario.setApellido("Kim");
		propietario.setCedula("0702182762");
		this.propietarioService.insertarPropietario(propietario);

		System.out.println("\n---------------------------------------\n");

		System.out.println("2. Crear un vehículo.");
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Lamborghini");
		vehiculo.setModelo("Zentorno");
		vehiculo.setPlaca("PFS - 182");
		vehiculo.setPrecio(new BigDecimal(500000));
		vehiculo.setTipo("L");
		this.vehiculoService.insertarVehiculo(vehiculo);

		System.out.println("\n---------------------------------------\n");

		System.out.println("3. Actualizar un atributo del vehículo creado.");
		vehiculo.setModelo("Asterion");
		this.vehiculoService.actualizarVehiculo(vehiculo);

		System.out.println("\n---------------------------------------\n");

		System.out.println("4. Realizar una matrícula de vehículo a partir de los datos: cédula y vehículo.");
		this.gestorService.generarMatricula("0702182762", "PFS - 182");
	}

}
