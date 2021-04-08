package week6;

public class BankAccount {
	private String accountNum;// ø®∫≈
	private double balance;// ”‡∂Ó

	public BankAccount() {
		super();
	}

	public BankAccount(String accountNum, double balance) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "ø®∫≈: " + this.accountNum + "\n" + "”‡∂Ó: " + this.balance + "\n";
	}
}