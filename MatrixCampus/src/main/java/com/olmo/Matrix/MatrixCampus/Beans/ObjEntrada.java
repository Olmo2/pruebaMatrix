package com.olmo.Matrix.MatrixCampus.Beans;

import java.time.LocalDateTime;
/**
 * Objeto de Entrada para endpoint
 * @author OLMO
 *
 */
public class ObjEntrada {

	private LocalDateTime fechaInicio;
	private Integer idProducto;
	private Integer idCadena;
	
	public LocalDateTime  getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDateTime fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public Integer getIdCadena() {
		return idCadena;
	}
	public void setIdCadena(Integer idCadena) {
		this.idCadena = idCadena;
	}
	@Override
	public String toString() {
		return "ObjEntrada [fechaInicio=" + fechaInicio + ", idProducto=" + idProducto + ", idCadena=" + idCadena + "]";
	}
	
	
}
