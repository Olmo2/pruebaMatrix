package com.olmo.Matrix.MatrixCampus.service;

import java.time.LocalDateTime;
/**
 * Objeto de Entrada para endpoint
 * @author OLMO
 *
 */
public class RequestDTO {

	private LocalDateTime startDate;
	private Integer productId;
	private Integer brandId;
	
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	@Override
	public String toString() {
		return "RequestDTO [startDate=" + startDate + ", productId=" + productId + ", brandId=" + brandId + "]";
	}
	
	
	
	
}
