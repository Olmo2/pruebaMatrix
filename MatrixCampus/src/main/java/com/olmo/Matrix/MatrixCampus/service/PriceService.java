package com.olmo.Matrix.MatrixCampus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olmo.Matrix.MatrixCampus.beans.Price;
import com.olmo.Matrix.MatrixCampus.repository.CadenaRepository;
import com.olmo.Matrix.MatrixCampus.repository.PriceRepository;

@Service
public class PriceService {
	
	@Autowired
	PriceRepository priceRepository;
	
	@Autowired
	CadenaRepository cadenaRepository;
		
	/**
	 * Devuelve los "PRICES" filtrando por los campos del @param requestDTO
	 * @param requestDTO obj con los parametros para el filtrado, Brand id, product Id, Start Date, End Date
	 * @return List de PRICE
	 */
	public List<ResponseDTO> getPrices(RequestDTO requestDTO) {
		List<Price>result = new ArrayList<Price>();
		
		 priceRepository.findByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(requestDTO.getBrandId(),requestDTO.getProductId(),
				 requestDTO.getStartDate(),requestDTO.getStartDate()).forEach(result::add);
		return toListRequestDTO(result);
	}
		
	/**
	 * Metodo auxiliar para transformar un price a un objSalida
	 * @param price el obj price a transformar
	 * @return el objSalida
	 */
	private ResponseDTO toRequestDTO(Price price) {
		ResponseDTO salida = new ResponseDTO();
		
		salida.setCurr(price.getCurr());
		salida.setEndDate(price.getEndDate());
		salida.setStartDate(price.getStartDate());
		salida.setBrandId(price.getBrandId());
		salida.setProductId(price.getProductId());
		salida.setFinalPrice(price.getPrice());
		salida.setRate(salida.getRate());
		
		return salida;		
	}
	/**
	 * Metodo auxiliar para transformar una lista de price a una lista de ResponseDTO
	 * @param prices la lista de obj price a transformar
	 * @return la lista de ResponseDTO
	 */
	private List<ResponseDTO> toListRequestDTO(List<Price> prices){
		List<ResponseDTO> response = new ArrayList<ResponseDTO>();
		for (Price price : prices) {
			response.add(toRequestDTO(price));
		}
		
		return response;
	}

}
