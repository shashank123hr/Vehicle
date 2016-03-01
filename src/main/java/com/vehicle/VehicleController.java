package com.vehicle;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class VehicleController {
	
    @Inject 
	VehiclesRepository vehicleRepository;
	
@RequestMapping(value = "/vehicles/prices/{price}/{sort}", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody List<Vehicles> findByPrice(@RequestParam(value = "price",required = false)Long price,
			                                         @RequestParam(value = "sort",required = false)Sort sort) {
	 List<Vehicles> v = vehicleRepository.findByPrice(price,sort);
	 return v;
	}
	
	
	@RequestMapping(value = "/vehicles/types/{sort}" , 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByType(@RequestParam(value = "sort",required = false)Sort sort) {
	 return new ResponseEntity<>(vehicleRepository.findByType(sort), HttpStatus.OK);
	 
	}
	
	
	@RequestMapping(value = "/vehicles/brands/{sort}", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByBrand(@RequestParam(value = "sort",required = false)Sort sort) {
            return new ResponseEntity<>(vehicleRepository.findByBrand(sort), HttpStatus.OK);
	 
	}
	
	@RequestMapping(value = "/vehicles/engine_types/{sort}", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByEngineType(@RequestParam(value = "sort",required = false)Sort sort) {
	 return new ResponseEntity<>(vehicleRepository.findByEngineType(sort), HttpStatus.OK);
	 
	}
	
	
	@RequestMapping(value = "/vehicles/colors/{sort}" , 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findBycolor(@RequestParam(value = "sort",required = false)Sort sort) {
	 return new ResponseEntity<>(vehicleRepository.findByColor(sort), HttpStatus.OK);
	 
	}
	
	
}
