package com.olmo.Matrix.MatrixCampus.Beans;



import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Price {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "BRAND_ID")
	private Integer BRANDID;
	@Column(name = "START_DATE")
	private LocalDateTime STARTDATE;
	@Column(name = "END_DATE")
	private LocalDateTime  ENDDATE;
	@Column(name="PRICE_LIST")
	private Integer PRICELIST;
	@Column(name="PRODUCT_ID")
	private Integer PRODUCTID;
	@Column
	private Integer PRIORITY;
	@Column
	private float PRICE;
	@Column
	private String CURR;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getBRANDID() {
		return BRANDID;
	}
	public void setBRANDID(Integer bRANDID) {
		BRANDID = bRANDID;
	}
	public LocalDateTime getSTARTDATE() {
		return STARTDATE;
	}
	public void setSTARTDATE(LocalDateTime sTARTDATE) {
		STARTDATE = sTARTDATE;
	}
	public LocalDateTime getENDDATE() {
		return ENDDATE;
	}
	public void setENDDATE(LocalDateTime eNDDATE) {
		ENDDATE = eNDDATE;
	}
	public Integer getPRICELIST() {
		return PRICELIST;
	}
	public void setPRICELIST(Integer pRICELIST) {
		PRICELIST = pRICELIST;
	}
	public Integer getPRODUCTID() {
		return PRODUCTID;
	}
	public void setPRODUCTID(Integer pRODUCTID) {
		PRODUCTID = pRODUCTID;
	}
	public Integer getPRIORITY() {
		return PRIORITY;
	}
	public void setPRIORITY(Integer pRIORITY) {
		PRIORITY = pRIORITY;
	}
	public float getPRICE() {
		return PRICE;
	}
	public void setPRICE(float pRICE) {
		PRICE = pRICE;
	}
	public String getCURR() {
		return CURR;
	}
	public void setCURR(String cURR) {
		CURR = cURR;
	}
	@Override
	public String toString() {
		return "Price [id=" + id + ", BRANDID=" + BRANDID + ", STARTDATE=" + STARTDATE + ", ENDDATE=" + ENDDATE
				+ ", PRICELIST=" + PRICELIST + ", PRODUCTID=" + PRODUCTID + ", PRIORITY=" + PRIORITY + ", PRICE="
				+ PRICE + ", CURR=" + CURR + "]";
	}
	
}