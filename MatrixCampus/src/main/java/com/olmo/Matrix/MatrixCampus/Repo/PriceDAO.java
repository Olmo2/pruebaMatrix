package com.olmo.Matrix.MatrixCampus.Repo;



import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.Matrix.MatrixCampus.Beans.Price;

@Repository 
public interface PriceDAO extends CrudRepository<Price, Integer> {
	
	  List<Price> findByBRANDIDAndPRODUCTIDAndSTARTDATEBeforeAndENDDATEAfterOrderByPRIORITYDesc(
	            Integer BRANDID, Integer PRODUCTID, LocalDateTime STARTDATE, LocalDateTime ENDDATE);
	}
