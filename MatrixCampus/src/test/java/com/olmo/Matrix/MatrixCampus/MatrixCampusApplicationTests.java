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

import com.olmo.Matrix.MatrixCampus.Beans.ObjEntrada;
import com.olmo.Matrix.MatrixCampus.Beans.ObjSalida;
import com.olmo.Matrix.MatrixCampus.Service.Services;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MatrixCampusApplicationTests {

	@Mock
	ObjSalida salida, salida2;

	@Mock
	ObjEntrada mockEntrada;

	@Mock
	List<ObjSalida> mockSalidaTest;

	@Mock
	List<ObjSalida> lista;

	@Autowired
	Services service;

	/**
	 * Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test1() {
		// Declaraciones
		salida = new ObjSalida();
		salida2 = new ObjSalida();
		mockSalidaTest = new ArrayList<ObjSalida>();
		mockEntrada = new ObjEntrada();

		// Mock entrada
		LocalDateTime fecha = LocalDateTime.parse("2020-06-16T09:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		mockEntrada.setFechaInicio(fecha);
		mockEntrada.setIdProducto(35455);
		mockEntrada.setIdCadena(1);

		// Mock salida
		salida.setIdProducto(35455);
		salida.setIdCadena(1);
		salida.setTarifa(null);
		salida.setPrecioFinal(38.95f);
		salida.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-15T16:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida.setFechaInicioAplicacion(fechaInicio);
		salida.setFechaFinAplicacion(fechaFin);
		mockSalidaTest.add(salida);

		salida2.setIdProducto(35455);
		salida2.setIdCadena(1);
		salida2.setTarifa(null);
		salida2.setPrecioFinal(35.5f);
		salida2.setCurr("EUR");
		LocalDateTime fechaInicio2 = LocalDateTime.parse("2020-06-14T00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin2 = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida2.setFechaInicioAplicacion(fechaInicio2);
		salida2.setFechaFinAplicacion(fechaFin2);
		mockSalidaTest.add(salida2);

		// Llamada al servicio
		lista = service.getPrices(mockEntrada);

		// Comprobaciones
		assertFalse(lista.isEmpty());
		assertEquals(lista, mockSalidaTest);
	}

	/**
	 * Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test2() {
		// Declaraciones
		salida = new ObjSalida();
		salida2 = new ObjSalida();
		mockSalidaTest = new ArrayList<ObjSalida>();
		mockEntrada = new ObjEntrada();

		// Mock entrada
		LocalDateTime fecha = LocalDateTime.parse("2020-06-14T16:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		mockEntrada.setFechaInicio(fecha);
		mockEntrada.setIdProducto(35455);
		mockEntrada.setIdCadena(1);

		// Mock salida
		salida.setIdProducto(35455);
		salida.setIdCadena(1);
		salida.setTarifa(null);
		salida.setPrecioFinal(25.45f);
		salida.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-14T15:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-06-14T18:30:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida.setFechaInicioAplicacion(fechaInicio);
		salida.setFechaFinAplicacion(fechaFin);
		mockSalidaTest.add(salida);

		salida2.setIdProducto(35455);
		salida2.setIdCadena(1);
		salida2.setTarifa(null);
		salida2.setPrecioFinal(35.5f);
		salida2.setCurr("EUR");
		LocalDateTime fechaInicio2 = LocalDateTime.parse("2020-06-14T00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin2 = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida2.setFechaInicioAplicacion(fechaInicio2);
		salida2.setFechaFinAplicacion(fechaFin2);
		mockSalidaTest.add(salida2);

		// Llamada al servicio
		List<ObjSalida> lista = service.getPrices(mockEntrada);

		// Comprobaciones
		assertFalse(lista.isEmpty());
		assertEquals(lista, mockSalidaTest);
	}

	/**
	 * Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test3() {
		// Declaraciones
		salida = new ObjSalida();
		salida2 = new ObjSalida();
		mockSalidaTest = new ArrayList<ObjSalida>();
		mockEntrada = new ObjEntrada();

		// Mock entrada
		LocalDateTime fecha = LocalDateTime.parse("2020-06-14T21:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		mockEntrada.setFechaInicio(fecha);
		mockEntrada.setIdProducto(35455);
		mockEntrada.setIdCadena(1);

		// Mock salida
		salida.setIdProducto(35455);
		salida.setIdCadena(1);
		salida.setTarifa(null);
		salida.setPrecioFinal(35.5f);
		salida.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-14T00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida.setFechaInicioAplicacion(fechaInicio);
		salida.setFechaFinAplicacion(fechaFin);
		mockSalidaTest.add(salida);

		// Llamada al servicio
		List<ObjSalida> lista = service.getPrices(mockEntrada);

		// Comprobaciones
		assertFalse(lista.isEmpty());
		assertEquals(lista, mockSalidaTest);
	}

	/**
	 * Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test4() {
		// Declaraciones
		salida = new ObjSalida();
		salida2 = new ObjSalida();
		mockSalidaTest = new ArrayList<ObjSalida>();
		mockEntrada = new ObjEntrada();

		// Mock entrada
		LocalDateTime fecha = LocalDateTime.parse("2020-06-15T10:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		mockEntrada.setFechaInicio(fecha);
		mockEntrada.setIdProducto(35455);
		mockEntrada.setIdCadena(1);

		// Mock salida
		salida.setIdProducto(35455);
		salida.setIdCadena(1);
		salida.setTarifa(null);
		salida.setPrecioFinal(30.5f);
		salida.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-15T00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-06-15T11:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida.setFechaInicioAplicacion(fechaInicio);
		salida.setFechaFinAplicacion(fechaFin);
		mockSalidaTest.add(salida);

		salida2.setIdProducto(35455);
		salida2.setIdCadena(1);
		salida2.setTarifa(null);
		salida2.setPrecioFinal(35.5f);
		salida2.setCurr("EUR");
		LocalDateTime fechaInicio2 = LocalDateTime.parse("2020-06-14T00:00:00");
		LocalDateTime fechaFin2 = LocalDateTime.parse("2020-12-31T23:59:59");
		salida2.setFechaInicioAplicacion(fechaInicio2);
		salida2.setFechaFinAplicacion(fechaFin2);
		mockSalidaTest.add(salida2);

		// Llamada al servicio
		List<ObjSalida> lista = service.getPrices(mockEntrada);

		// Comprobaciones
		assertFalse(lista.isEmpty());
		assertEquals(lista, mockSalidaTest);
	}

	/**
	 * Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1
	 * (ZARA)
	 */
	@Test
	public void test5() {
		// Declaraciones
		salida = new ObjSalida();
		salida2 = new ObjSalida();
		mockSalidaTest = new ArrayList<ObjSalida>();
		mockEntrada = new ObjEntrada();

		// Mock entrada
		LocalDateTime fecha = LocalDateTime.parse("2020-06-16T21:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		mockEntrada.setFechaInicio(fecha);
		mockEntrada.setIdProducto(35455);
		mockEntrada.setIdCadena(1);

		// Mock salida
		salida.setIdProducto(35455);
		salida.setIdCadena(1);
		salida.setTarifa(null);
		salida.setPrecioFinal(38.95f);
		salida.setCurr("EUR");
		LocalDateTime fechaInicio = LocalDateTime.parse("2020-06-15T16:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida.setFechaInicioAplicacion(fechaInicio);
		salida.setFechaFinAplicacion(fechaFin);
		mockSalidaTest.add(salida);

		salida2.setIdProducto(35455);
		salida2.setIdCadena(1);
		salida2.setTarifa(null);
		salida2.setPrecioFinal(35.5f);
		salida2.setCurr("EUR");
		LocalDateTime fechaInicio2 = LocalDateTime.parse("2020-06-14T00:00:00",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		LocalDateTime fechaFin2 = LocalDateTime.parse("2020-12-31T23:59:59",
				DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss"));
		salida2.setFechaInicioAplicacion(fechaInicio2);
		salida2.setFechaFinAplicacion(fechaFin2);
		mockSalidaTest.add(salida2);

		// Llamada al servicio
		List<ObjSalida> lista = service.getPrices(mockEntrada);

		// Comprobaciones
		assertFalse(lista.isEmpty());
		assertEquals(lista, mockSalidaTest);
	}

}
