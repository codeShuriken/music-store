package com.gowt.musicstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Genre;


@Repository
public interface GenreRepository extends CrudRepository<Genre, Integer>{
	public Genre findByName(String name);
}