package com.vehicle;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


public interface VehiclesRepository extends PagingAndSortingRepository<Vehicles, Long> {
	
	@Query("select avg(v.price) as price , v.type as type from Vehicles v group by v.type order by price")
	List<Vehicles> findByType();	
	
	@Query("select  v.brand as brand, avg(v.price) as price from Vehicles v group by v.brand order by price")
	List<Vehicles> findByBrand();
	
	@Query("select avg(v.price) as price , v.enginetype as enginetype from Vehicles v group by v.enginetype order by price")
	List<Vehicles> findByEngineType();
	
	@Query("select avg(v.price) as price , v.color as color from Vehicles v group by v.color order by price")
	List<Vehicles> findByColor();
	
	@Query("select v.price,v.type,v.brand,v.color,v.enginetype from Vehicles v where v.price = :price")
	@Modifying
	List<Vehicles> findByPrice(@Param("price")long price);


}
