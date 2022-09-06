package assignment8;

public class Operation {

	// Deposit Operation
	public void deposit(double amount, Account ac) throws InvalidAmountException {

		if (amount <= 0) {
			throw new InvalidAmountException();
//	      throw new InvalidAmountException(
//	               "Invalid amount;");
		} else {
			ac.setBalance(ac.getBalance() + amount);
		}

	}

	// withdraw operation
	public double withdraw(double amount, Account ac)
			throws InvalidAmountException, InsufficientBalanceException, InputMismatchException {

		if (amount <= 0) {
			throw new InvalidAmountException();
//	      throw new InvalidAmountException(
//	              "Invalid amount;");
		}

		else if (ac.getBalance() < amount) {
			throw new InsufficientBalanceException();
//	      throw new InsufficientBalanceException(amount +
//	                 " not available in your account");
		} else {
			ac.setBalance(ac.getBalance() - amount);
			return amount;
		}
	}

	// balanceEnquiry operation
	public double balanceEnquiry(Account ac) {
		return ac.getBalance();
	}

}
