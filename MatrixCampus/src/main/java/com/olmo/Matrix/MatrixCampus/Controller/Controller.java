package com.olmo.Matrix.MatrixCampus.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.Matrix.MatrixCampus.Beans.Cadena;
import com.olmo.Matrix.MatrixCampus.Beans.ObjEntrada;
import com.olmo.Matrix.MatrixCampus.Beans.ObjSalida;
import com.olmo.Matrix.MatrixCampus.Beans.Price;
import com.olmo.Matrix.MatrixCampus.Service.Services;

@RestController
public class Controller {

	@Autowired
	Services service;

	@GetMapping("/hola")
	public Cadena get() {
		Cadena c = new Cadena();
		c.setBRAND_ID(3);
		c.setBRAND_NAME("DIA");
		return c;

	}

	@GetMapping("/prices")
	public List<Price> getAllPrices(@RequestBody ObjEntrada objEntrada) {

		return service.getAllPrices();

	}

	@GetMapping("/pricesPrueba")
	public List<ObjSalida> getPrices(@RequestBody ObjEntrada objEntrada) {

		return service.getPrices(objEntrada);

	}

	@GetMapping("/cadenas")
	public List<Cadena> getAllCadenas() {

		return service.getAllCadenas();

	}
}
