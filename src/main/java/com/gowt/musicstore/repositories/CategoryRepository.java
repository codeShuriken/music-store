package com.gowt.musicstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Category;
import com.gowt.musicstore.entities.Genre;



@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer>{
	public Category findByNameAndGenre(String name, Genre genre);
}
