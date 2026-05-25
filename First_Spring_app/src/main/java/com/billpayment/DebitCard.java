package com.billpayment;

import org.springframework.stereotype.Component;

@Component
public class DebitCard implements Ipayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment successful through Debit-card";
	}

}


