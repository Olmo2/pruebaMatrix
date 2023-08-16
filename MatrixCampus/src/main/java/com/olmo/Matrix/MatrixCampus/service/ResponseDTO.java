package com.olmo.Matrix.MatrixCampus.service;

import java.time.LocalDateTime;
import java.util.Objects;

public class ResponseDTO {

	private Integer productId;
	private Integer brandId;
	private Integer rate;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private Float finalPrice;
	private String curr;

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

	public Integer getRate() {
		return rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}

	public Float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	@Override
	public String toString() {
		return "ResponseDTO [productId=" + productId + ", brandId=" + brandId + ", rate=" + rate + ", startDate="
				+ startDate + ", endDate=" + endDate + ", finalPrice=" + finalPrice + ", curr=" + curr + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandId, curr, endDate, finalPrice, productId, rate, startDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseDTO other = (ResponseDTO) obj;
		return Objects.equals(brandId, other.brandId) && Objects.equals(curr, other.curr)
				&& Objects.equals(endDate, other.endDate) && Objects.equals(finalPrice, other.finalPrice)
				&& Objects.equals(productId, other.productId) && Objects.equals(rate, other.rate)
				&& Objects.equals(startDate, other.startDate);
	}

}
