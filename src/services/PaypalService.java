package services;

public class PaypalService implements OnlinePaymentService{

	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTH_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(Double amount, Integer months) {
		return amount * months * MONTH_INTEREST;
	}

}
