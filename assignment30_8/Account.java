package assignment30_8;

public class Account {
//	account number int primary key, customer id int,  type varchar(50), balance double
	private int accNo;
	private int customerId;
	private double Balance;
	private String accountType;

	public Account() {
		super();
	}

	public Account(int accNo, int customerId, double balance, String accountType) {
		super();
		this.accNo = accNo;
		this.customerId = customerId;
		Balance = balance;
		this.accountType = accountType;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", customerId=" + customerId + ", Balance=" + Balance + ", accountType="
				+ accountType + "]";
	}

}
