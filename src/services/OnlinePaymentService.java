package services;

public interface OnlinePaymentService {

	public double paymentFee(double amount);
	public double interest(Double amount, Integer months);
}
