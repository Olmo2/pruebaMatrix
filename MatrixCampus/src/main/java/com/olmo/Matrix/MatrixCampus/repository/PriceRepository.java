package com.olmo.Matrix.MatrixCampus.repository;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.Matrix.MatrixCampus.beans.Price;

@Repository 
public interface PriceRepository extends CrudRepository<Price, Integer> {
	
    List<Price> findByBrandIdAndProductIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
            Integer brandId, Integer productId, LocalDateTime startDate, LocalDateTime endDate);
}