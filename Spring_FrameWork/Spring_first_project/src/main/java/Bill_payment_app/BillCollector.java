package Bill_payment_app;

public class BillCollector {
private Ipayment payment;
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public BillCollector() {
		
	}
	
	public BillCollector(Ipayment payment) {
		this.payment = payment;
	}
	
	public void collectPayment(double amount) {
		String status = payment.pay(amount);
		System.out.println(status);
	}
}

