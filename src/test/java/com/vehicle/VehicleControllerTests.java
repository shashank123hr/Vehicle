package com.vehicle;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

public class VehicleControllerTests {

	@Inject
	VehiclesRepository vehicleRepository;
	
	private MockMvc restVehiclesMockMvc;
	
	private Vehicles vehicles;
	
	 @PostConstruct
	    public void setup() {
	        MockitoAnnotations.initMocks(this);
	        VehicleController vehicleController = new VehicleController();
	        ReflectionTestUtils.setField(vehicleController, "vehicleRepository", vehicleRepository);
	        this.restVehiclesMockMvc = MockMvcBuilders.standaloneSetup(vehicleController).build();
	    }
	
	@Test
    @Transactional
    public void findByType() throws Exception {
        // Initialize the database
		
		
		//assert(vehicleRepository.findAll()).hasSize(0);
        //vehicleRepository.saveAndFlush(vehicles);

        // Get the project
        //restVehiclesMockMvc.perform(get())
           // .andExpect(status().isOk())
            //.andExpect(content().contentType(MediaType.APPLICATION_JSON));
            
    }

}
