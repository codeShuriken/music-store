package com.gowt.musicstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Product;


@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
