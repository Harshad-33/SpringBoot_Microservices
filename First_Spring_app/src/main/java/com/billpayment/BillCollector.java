package com.billpayment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillCollector {
	private Ipayment payment = null ;
	
	@Autowired
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}
}
