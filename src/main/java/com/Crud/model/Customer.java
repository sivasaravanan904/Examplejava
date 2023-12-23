package com.Crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Cus_Table")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="cusId")
	private int cusId;
	
	@Column(name ="cusName")
	private String cusName;
	
	@Column(name ="cusLocation")
	private String cusLocation;
	
	
	public int getCusId() {
		return cusId;
	}
	public void setCusId(int cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusLocation() {
		return cusLocation;
	}
	public void setCusLocation(String cusLocation) {
		this.cusLocation = cusLocation;
	}
	
	
}
