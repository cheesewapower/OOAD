package com.datamarket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="guitar")
public class Guitar implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String serialNumber;
	private String builder;
	private String guitarModel;
	private String type;
	private String backWood;
	private String topWood;
	
	private double price;
    public Guitar(String serialNumber, String builder,String model,String type,
    		      String backWood,String topWood,double price){
    	 this.backWood=backWood;
    	 this.builder=builder;
    	 this.id=id;
    	 this.guitarModel=guitarModel;
    	 this.price=price;
    	 this.serialNumber=serialNumber;
    	 this.topWood=topWood;
    	 this.type=type;
    	
    }

	
    @Id
    @Column(name="id",unique=true,nullable=false)
	public Integer getId() {
		return id;
	}
    
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(name="serial_number",nullable=false,length=32)
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Column(name="builder",nullable=false,length=32)
	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}
	

	@Column(name="type",nullable=false,length=32)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Column(name="backwood",nullable=false,length=32)
	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	@Column(name="topwood",nullable=false,length=32)
	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	@Column(name="price",nullable=false,length=32)
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	@Column(name="guitar_model",nullable=false,length=32)
	public String getGuitarModel() {
		return guitarModel;
	}


	public void setGuitarModel(String guitarModel) {
		this.guitarModel = guitarModel;
	}
	
	
	
	
	
	
	
	
	
	
}
