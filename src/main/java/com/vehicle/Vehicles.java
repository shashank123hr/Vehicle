package com.vehicle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

	
	@Override
	public String toString() {
		return "VehicleModel [vin=" + vin + ", type=" + type + ", brand="
				+ brand + ", color=" + color + ", enginetype=" + enginetype
				+ ", price=" + price + ", year=" + year + "]";
	}  
}
