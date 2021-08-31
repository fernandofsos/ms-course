package com.devsuperior.hrpayroll.components;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;

@Component
public class PaymentComponent {
	
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	
	@Autowired
	RestTemplate restTemplate;

	public Payment payment(long workerId, int days ) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id",  Long.toString(workerId) );
		
		Worker worker = restTemplate.getForObject(workerHost +"/workers/{id}", Worker.class, uriVariables);
		
		return new Payment(worker.getName(), worker.getDailyIcome(),days);
	}

	
	
}
