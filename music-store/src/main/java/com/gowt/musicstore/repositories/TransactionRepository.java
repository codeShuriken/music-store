package com.gowt.musicstore.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.Cart;
import com.gowt.musicstore.entities.Transaction;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer>{
	public Transaction findByCart(Cart cart);
}
