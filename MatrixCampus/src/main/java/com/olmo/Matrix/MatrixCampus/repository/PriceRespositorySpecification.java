package com.olmo.Matrix.MatrixCampus.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.olmo.Matrix.MatrixCampus.beans.Price;


public interface PriceRespositorySpecification extends CrudRepository<Price, Integer>, JpaSpecificationExecutor<Price> {

}
