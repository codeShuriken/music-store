package com.gowt.musicstore.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Product;
import com.gowt.musicstore.entities.Track;


@Repository
public interface TrackRepository extends CrudRepository<Track, Integer>{
	public Track findByProduct(Product product);

}