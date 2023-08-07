package com.olmo.Matrix.MatrixCampus.beans;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BRANDS")
public class Brand {

	@Id
	@Column(name = "BRAND_ID")
	private Integer brandID;

	@Column(name = "BRAND_NAME")
	private String branName;

	public Integer getBrandID() {
		return brandID;
	}

	public void setBrandID(Integer brandID) {
		this.brandID = brandID;
	}

	public String getBranName() {
		return branName;
	}

	public void setBranName(String branName) {
		this.branName = branName;
	}

	@Override
	public String toString() {
		return "Cadena [brandID=" + brandID + ", branName=" + branName + "]";
	}

}
