package com.olmo.Matrix.MatrixCampus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.Matrix.MatrixCampus.service.PriceService;
import com.olmo.Matrix.MatrixCampus.service.RequestDTO;
import com.olmo.Matrix.MatrixCampus.service.ResponseDTO;

@RestController
public class PriceRESTController {

	@Autowired
	PriceService service;

	@GetMapping("/pricesPrueba")
	public List<ResponseDTO> getPrices(@RequestBody RequestDTO requestDTO) {

		return service.getPrices(requestDTO);

	}
	@GetMapping("/pricesPruebaSpecification")
	public List<ResponseDTO> get(@RequestBody RequestDTO requestDTO) {

		return service.getPricesSpecification(requestDTO);

	}

}
