package com.olmo.Matrix.MatrixCampus.Beans;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Objects;

public class ObjSalida {

	private Integer idProducto;
	private Integer idCadena;
	private Integer tarifa;
	private LocalDateTime fechaInicioAplicacion;
	private LocalDateTime fechaFinAplicacion;
	private Float precioFinal;
	private String curr;

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

	public Integer getTarifa() {
		return tarifa;
	}

	public void setTarifa(Integer tarifa) {
		this.tarifa = tarifa;
	}

	public LocalDateTime getFechaInicioAplicacion() {
		return fechaInicioAplicacion;
	}

	public void setFechaInicioAplicacion(LocalDateTime fechaInicioAplicacion) {
		this.fechaInicioAplicacion = fechaInicioAplicacion;
	}

	public LocalDateTime getFechaFinAplicacion() {
		return fechaFinAplicacion;
	}

	public void setFechaFinAplicacion(LocalDateTime fechaFinAplicacion) {
		this.fechaFinAplicacion = fechaFinAplicacion;
	}

	public Float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(Float precioFinal) {
		this.precioFinal = precioFinal;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	@Override
	public String toString() {
		return "ObjSalida [idProducto=" + idProducto + ", idCadena=" + idCadena + ", tarifa=" + tarifa
				+ ", fechaInicioAplicacion=" + fechaInicioAplicacion + ", fechaFinAplicacion=" + fechaFinAplicacion
				+ ", precioFinal=" + precioFinal + ", curr=" + curr + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(curr, fechaFinAplicacion, fechaInicioAplicacion, idCadena, idProducto, precioFinal, tarifa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjSalida other = (ObjSalida) obj;
		return Objects.equals(curr, other.curr) && Objects.equals(fechaFinAplicacion, other.fechaFinAplicacion)
				&& Objects.equals(fechaInicioAplicacion, other.fechaInicioAplicacion)
				&& Objects.equals(idCadena, other.idCadena) && Objects.equals(idProducto, other.idProducto)
				&& Objects.equals(precioFinal, other.precioFinal) && Objects.equals(tarifa, other.tarifa);
	}

}
