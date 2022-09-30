package Quation1;

public class Amount {

	private double amount=50;

	public Amount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Amount(double amount) {
		super();
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Amount [amount=" + amount + "]";
	}
	
}
