package customers;

public class Account {

	private int numberAccount;
	private String holderAccount;
	private double balance;

	public Account(int numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public Account(int numberAccount, String holderAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		deposit(initialDeposit);
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void whithdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return ("Account: " + numberAccount + ", Holder: " 
	    + holderAccount + ", Balance: " + balance);
	}

	
}
