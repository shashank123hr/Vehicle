package com.vehicle;

import java.util.List;

import javax.inject.Inject;
import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




/* Rest Controller to handle appropriate rest calls and map necessary methods */


@RestController
public class VehicleController {
	
	 private final Logger log = LoggerFactory.getLogger(VehicleController.class);
	
    @Inject 
	VehiclesRepository vehicleRepository;
    
    // Method to fetch data price	
@RequestMapping(value = "/vehicles/prices/{price}", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByPrice(@PathVariable Long price){
	
	log.debug("Rest request to fetch data by price",price);
	if(price==null) return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	return new ResponseEntity<>(vehicleRepository.findByPrice(price), HttpStatus.OK);
	
}
	

      //Method to fetch data by types
	@RequestMapping(value = "/vehicles/types" , 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByType() {
		log.debug("Rest request to fetch data by types");
	 return new ResponseEntity<>(vehicleRepository.findByType(), HttpStatus.OK);
	 
	}
	
	//Method to fetch data by brands
	@RequestMapping(value = "/vehicles/brands", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByBrand() {
            return new ResponseEntity<>(vehicleRepository.findByBrand(), HttpStatus.OK);
	 
	}
	
	//Method to fetch data by engine types 
	@RequestMapping(value = "/vehicles/engine_types", 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findByEngineType() {
	 return new ResponseEntity<>(vehicleRepository.findByEngineType(), HttpStatus.OK);
	 
	}
	
	//Method to fetch data by colors
	@RequestMapping(value = "/vehicles/colors" , 
			        method = RequestMethod.GET, 
			        produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody ResponseEntity<List<Vehicles>> findBycolor() {
	 return new ResponseEntity<>(vehicleRepository.findByColor(), HttpStatus.OK);
	 
	}
	
	
}
