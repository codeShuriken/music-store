package com.gowt.musicstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Cart;
import com.gowt.musicstore.entities.User;


@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
	public Iterable<Cart> findByUser(User user);
}
