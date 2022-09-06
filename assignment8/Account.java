package assignment8;
public class Account {
	private int acc_no;
	private double balance;
	
	public Account(int acc_no, double balance) {
		super();
		this.acc_no = acc_no;
		this.balance = balance;
	}
	

	public int getAcc_no() {
		return acc_no;
	}


	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [acc_no=" + acc_no + ", balance=" + balance + "]";
	}
	
	
	
	
	

}

