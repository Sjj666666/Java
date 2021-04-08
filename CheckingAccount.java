package week6;

public class CheckingAccount extends BankAccount {
	private double serviceCharge;// �����

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, double balance, double serviceCharge) {
		super(accountNum, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public void assessServiceCharge() {
		super.setBalance(super.getBalance() - this.serviceCharge);
	}

	public String toString() {
		return super.toString() + "�����: " + this.serviceCharge;
	}
}