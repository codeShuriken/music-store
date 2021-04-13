package com.gowt.musicstore.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Album;
import com.gowt.musicstore.entities.Product;


@Repository
public interface AlbumRepository extends CrudRepository<Album, Integer>{
	public Album findByProduct(Product product);

}