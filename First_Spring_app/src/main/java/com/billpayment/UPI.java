package com.billpayment;
import org.springframework.stereotype.Component;

@Component
public class UPI implements Ipayment {

	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "payment successfull through UPI";
	}

}

