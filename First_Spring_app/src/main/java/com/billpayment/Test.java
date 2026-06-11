package com.billpayment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		 ApplicationContext context =
	                new AnnotationConfigApplicationContext(AppConfig.class);

	        BillCollector billCollector =
	                context.getBean(BillCollector.class);
	        billCollector.collectPayment(5000);
	     
	}
}

