package com.gowt.musicstore.entities;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdersResult {
	private Integer tid;
	
	private LocalDate purchasedOn;
	private PaymentInfo paymentInfo;
	private boolean delivered;
}
