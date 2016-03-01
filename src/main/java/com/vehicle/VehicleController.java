package com.vehicle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class VehicleController {
	

	
	@Inject 
	VehiclesRepository vehicleRepository;
	
	
	@RequestMapping("/greeting")
			 public @ResponseBody String greeting() {
			return "Hello";
			}

	@RequestMapping("/vehicle/price/{price}")
	 public @ResponseBody List<Vehicles> findByPrice(Long price, Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByPrice(price,sort);
	 return v;
	}
	
	
	@RequestMapping("/vehicle/types")
	 public @ResponseBody List<Vehicles> findByType(Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByType(sort);
	 return v;
	}
	
	
	@RequestMapping("/vehicles/brands")
	 public @ResponseBody List<Vehicles> findByBrand(Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByBrand(sort);
	 return v;
	}
	
	@RequestMapping("/vehicle/engine_type")
	 public @ResponseBody List<Vehicles> findByEngineType(Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByEngineType(sort);
	 return v;
	}
	
	
	@RequestMapping("/vehicle/colors")
	 public @ResponseBody List<Vehicles> findBycolor(Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByColor(sort);
	 return v;
	}
	
	
}
