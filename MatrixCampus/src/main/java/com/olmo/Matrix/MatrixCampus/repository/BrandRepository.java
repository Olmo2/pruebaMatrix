package com.olmo.Matrix.MatrixCampus.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.Matrix.MatrixCampus.beans.Brand;

@Repository
public interface BrandRepository extends CrudRepository<Brand, Integer> {

}
