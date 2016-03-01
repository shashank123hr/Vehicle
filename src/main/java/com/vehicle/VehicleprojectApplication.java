package com.vehicle;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

//Main Vehicle Spring class that initiates the application

@SpringBootApplication
public class VehicleprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleprojectApplication.class, args);
	}
	
	@Bean
	public EmbeddedDatabase dataSource() {
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase db = builder
			.setType(EmbeddedDatabaseType.H2)
			.addScript("schema-all.sql")
			.addScript("insert.sql")
			.build();
		return db;
	}
	 
}
