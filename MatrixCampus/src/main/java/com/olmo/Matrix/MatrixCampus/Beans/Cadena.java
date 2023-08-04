package com.olmo.Matrix.MatrixCampus.Beans;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="CADENAS")
public class Cadena {

	@Id
	private Integer BRAND_ID;
	@Column
	private String BRAND_NAME;
	
		
	public Integer getBRAND_ID() {
		return BRAND_ID;
	}
	public void setBRAND_ID(Integer bRAND_ID) {
		BRAND_ID = bRAND_ID;
	}
	public String getBRAND_NAME() {
		return BRAND_NAME;
	}
	public void setBRAND_NAME(String bRAND_NAME) {
		BRAND_NAME = bRAND_NAME;
	}
	
	@Override
	public String toString() {
		return "Cadena [BRAND_ID=" + BRAND_ID + ", BRAND_NAME=" + BRAND_NAME + "]";
	}
}
