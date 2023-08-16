package com.olmo.Matrix.MatrixCampus;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.olmo.Matrix.MatrixCampus.service.PriceService;
import com.olmo.Matrix.MatrixCampus.service.RequestDTO;
import com.olmo.Matrix.MatrixCampus.service.ResponseDTO;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MatrixCampusApplicationTests {

	@Mock
	ResponseDTO responseDTO, responseDTO1;

	@Mock
	RequestDTO requestDTO;

	@Mock
	List<ResponseDTO> listResponseDTO,response;
	
	@Mock
	LocalDateTime date,startDate,endDate,startDate1,endDate1;

	@Autowired
	PriceService priceService;

	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200614100000Brand1Product35455() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-16T09:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);
				
		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(38.95f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-15T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);
		
		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		
		listResponseDTO.add(responseDTO1);
		
		response = priceService.getPrices(requestDTO);
		
		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200614160000Brand1Product35455() {
		
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-14T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(25.45f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-14T15:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-06-14T18:30:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);
		
		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		
		listResponseDTO.add(responseDTO1);

		response = priceService.getPrices(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200614210000Brand1Product35455() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-14T21:00:00",	DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(35.5f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		response = priceService.getPrices(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200615100000Brand1Product35455() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-15T10:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(30.5f);
		responseDTO.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-15T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-06-15T11:00:00",	DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(fechaInicio);
		responseDTO.setEndDate(fechaFin);

		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00");
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59");
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		listResponseDTO.add(responseDTO1);

		response = priceService.getPrices(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200616210000Brand1Product35455() {
		requestDTO = new RequestDTO();
		LocalDateTime fecha = LocalDateTime.parse("2020-06-16T21:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(fecha);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(38.95f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-15T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);

		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		listResponseDTO.add(responseDTO1);

		response = priceService.getPrices(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}
	
	
	
	@Test
	public void test20200614100000Brand1Product35455Specification() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-16T09:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);
				
		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(38.95f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-15T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);
		
		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		
		listResponseDTO.add(responseDTO1);
		
		response = priceService.getPricesSpecification(requestDTO);
		
		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200614160000Brand1Product35455Specification() {
		
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-14T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(25.45f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-14T15:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-06-14T18:30:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);
		
		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		
		listResponseDTO.add(responseDTO1);

		response = priceService.getPricesSpecification(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200614210000Brand1Product35455Specification() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-14T21:00:00",	DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(35.5f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);
		
		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		response = priceService.getPricesSpecification(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200615100000Brand1Product35455Specification() {
		requestDTO = new RequestDTO();
		date = LocalDateTime.parse("2020-06-15T10:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(date);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(30.5f);
		responseDTO.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-15T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-06-15T11:00:00",	DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(fechaInicio);
		responseDTO.setEndDate(fechaFin);

		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00");
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59");
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		listResponseDTO.add(responseDTO1);

		response = priceService.getPricesSpecification(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test20200616210000Brand1Product35455Specification() {
		requestDTO = new RequestDTO();
		LocalDateTime fecha = LocalDateTime.parse("2020-06-16T21:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		requestDTO.setStartDate(fecha);
		requestDTO.setProductId(35455);
		requestDTO.setBrandId(1);

		responseDTO = new ResponseDTO();
		responseDTO.setProductId(35455);
		responseDTO.setBrandId(1);
		responseDTO.setRate(null);
		responseDTO.setFinalPrice(38.95f);
		responseDTO.setCurr("EUR");
		startDate = LocalDateTime.parse("2020-06-15T16:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO.setStartDate(startDate);
		responseDTO.setEndDate(endDate);

		listResponseDTO = new ArrayList<ResponseDTO>();
		listResponseDTO.add(responseDTO);

		responseDTO1 = new ResponseDTO();
		responseDTO1.setProductId(35455);
		responseDTO1.setBrandId(1);
		responseDTO1.setRate(null);
		responseDTO1.setFinalPrice(35.5f);
		responseDTO1.setCurr("EUR");
		startDate1 = LocalDateTime.parse("2020-06-14T00:00:00",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		endDate1 = LocalDateTime.parse("2020-12-31T23:59:59",DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		responseDTO1.setStartDate(startDate1);
		responseDTO1.setEndDate(endDate1);
		listResponseDTO.add(responseDTO1);

		response = priceService.getPricesSpecification(requestDTO);

		assertFalse(response.isEmpty());
		assertEquals(response, listResponseDTO);
	}

}
