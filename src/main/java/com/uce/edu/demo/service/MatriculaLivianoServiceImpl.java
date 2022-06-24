package com.uce.edu.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("liviano")
public class MatriculaLivianoServiceImpl implements IMatriculaService{

	@Override
	public BigDecimal calcular(BigDecimal precioVehiculo) {
		// TODO Auto-generated method stub
		return precioVehiculo.multiply(new BigDecimal(0.14));
	}

}
