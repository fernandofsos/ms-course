package com.devsuperior.hrpayroll.components;

import org.springframework.stereotype.Component;

import com.devsuperior.hrpayroll.entities.Payment;

@Component
public class PaymentComponent {

	public Payment payment(long workerId, int days ) {
		return new Payment("BOB", 200.0,days);
	}

	
	
}
