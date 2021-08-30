package com.devsuperior.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.hrpayroll.components.PaymentComponent;
import com.devsuperior.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	@Autowired
	PaymentComponent paymentComponent;

	public Payment getPayment(long workerId, int days) {	
		return paymentComponent.payment(workerId, days);
	}

}
