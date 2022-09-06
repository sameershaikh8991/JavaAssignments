package assignment30_8;

import java.util.List;

public interface AccountDao {
	boolean addAccount(Account acc);
	boolean deleteAccount(int accNo);
	boolean updateAccount(Account acc);
	Account getAccountByAccountNO(int accNo);
	List<Account> getAllAccounts();
	boolean depositAmount(Account acc);
	boolean withdrawAmount(Account acc);
	

}
