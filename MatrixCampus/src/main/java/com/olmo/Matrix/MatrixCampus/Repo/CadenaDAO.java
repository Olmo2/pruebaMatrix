package com.olmo.Matrix.MatrixCampus.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.olmo.Matrix.MatrixCampus.Beans.Cadena;

@Repository
public interface CadenaDAO extends CrudRepository<Cadena, Integer> {

}
