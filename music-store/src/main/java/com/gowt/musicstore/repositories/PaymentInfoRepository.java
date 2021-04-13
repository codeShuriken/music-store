package com.gowt.musicstore.repositories;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gowt.musicstore.entities.PaymentInfo;
import com.gowt.musicstore.entities.User;

@Repository
public interface PaymentInfoRepository extends CrudRepository<PaymentInfo, Integer>{
	public PaymentInfo findByUser(User user);
	
	@Query("SELECT p FROM PaymentInfo p WHERE p.cardNumber = :cardNumber and p.cvv = :cvv")
	public PaymentInfo findByCardNumberAndCvv(@Param("cardNumber") BigInteger cardNumber, @Param("cvv") Integer cvv);
}
