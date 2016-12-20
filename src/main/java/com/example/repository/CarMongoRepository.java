package com.example.repository;

/**
 * Created by localadmin on 20/12/16.
 */

import org.springframework.data.repository.CrudRepository;

import com.example.model.Car;

public interface CarMongoRepository extends CrudRepository<Car, String>{}

//public interface CarMongoRepository extends CrudRepository{}
