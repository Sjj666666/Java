package week6;

public class SavingsAccount extends BankAccount {
	private double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + this.interestRate));
	}

	public String toString() {
		return super.toString() + "ÀûÂÊ: " + this.interestRate;
	}
}