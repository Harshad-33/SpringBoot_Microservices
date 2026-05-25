package com.billpayment;

import org.springframework.stereotype.Component;

@Component
public class Creditcardpayment implements Ipayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "Payment successfull by credit-card of "+amount;
	}
}


