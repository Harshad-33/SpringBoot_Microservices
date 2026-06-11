package Bill_payment_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		BillCollector bc = context.getBean("BillCollector",BillCollector.class);
		bc.collectPayment(5000);
	}
}

