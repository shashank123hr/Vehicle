package com.vehicle;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface VehiclesRepository extends JpaRepository<Vehicles, Long> {
	
	@Query("select v.price as price , v.type as type from Vehicles v group by v.type order by v.price asc")
	List<Vehicles> findByType(Sort sort);
	
	
	@Query("select v.price as price , v.brand as brand from Vehicles v group by v.brand order by v.price asc")
	List<Vehicles> findByBrand(Sort sort);
	
	@Query("select v.price as price , v.enginetype as enginetype from Vehicles v group by v.enginetype order by v.price asc")
	List<Vehicles> findByEngineType(Sort sort);
	
	@Query("select v.price as price , v.color as color from Vehicles v group by v.color order by v.price asc")
	List<Vehicles> findByColor(Sort sort);
	
	@Query("select v.type,v.brand,v.color,v.enginetype from Vehicles v where v.price = ?1")
	List<Vehicles> findByPrice(Long price, Sort sort);
	

}
