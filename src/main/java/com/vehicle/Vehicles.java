package com.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Vehicle Entity class to map Vehicle table 

@Entity
@Table(name="Vehicles")
public class Vehicles {
	
	@Id
	@Column(name="vin",unique = true, nullable = false)
	private Long vin;
	
	@Column(name="type")
    private String type;  
 
	@Column(name="brand")
    private String brand;  
	
	@Column(name="color")
    private String color;  

	@Column(name="enginetype")
    private String enginetype;  
	
	@Column(name="price")
    private Long price;  
	
	@Column(name="year")
    private String year;

	public Vehicles(Long vin, String type, String brand, String color,
			String enginetype, Long price, String year) {
		super();
		this.vin = vin;
		this.type = type;
		this.brand = brand;
		this.color = color;
		this.enginetype = enginetype;
		this.price = price;
		this.year = year;
	}

	public Vehicles() {
		// TODO Auto-generated constructor stub
	}

	public Long getVin() {
		return vin;
	}

	public void setVin(Long vin) {
		this.vin = vin;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEnginetype() {
		return enginetype;
	}

	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "VehicleModel [vin=" + vin + ", type=" + type + ", brand="
				+ brand + ", color=" + color + ", enginetype=" + enginetype
				+ ", price=" + price + ", year=" + year + "]";
	}  
}
