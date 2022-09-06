package assignment30_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DynamicOp implements AccountDao {
	// create update method, delete method to update and delete the records
	public boolean addAccount(Account acc) {
		boolean b = false;
		String sql = "insert into Account values(?,?,?,?)"; // ? : wil later replaced by actual
		// to prepare this query we need to use PreparedStatement object (interface)
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql); // sql must be passed here
			// ? : id : int
			pstatement.setInt(1, acc.getAccNo());
			pstatement.setInt(2, acc.getCustomerId());
			pstatement.setString(3, acc.getAccountType());
			pstatement.setDouble(4, acc.getBalance());

			int no = pstatement.executeUpdate(); // do not pass sql here
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean updateAccount(Account acc) {
		boolean b = false;
		String sql = "update account set accType=? where accno=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setString(1, acc.getAccountType());
			pstatement.setInt(2, acc.getAccNo());
//		
//			System.out.println(pstatement);
			int no = pstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean deleteAccount(int accNo) {
		boolean b = false;
		String sql = "delete from account where accno=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setInt(1, accNo);
//			System.out.println(pstatement);
			int no = pstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public Account getAccountByAccountNO(int accNo) {
		Account acc = null;
		String sql = "select * from account where accno=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setInt(1, accNo);
//				System.out.println(pstatement);
			ResultSet rset = pstatement.executeQuery();
			while (rset.next()) {
				int accNumber = rset.getInt("accno");
				int custId = rset.getInt("customerID");
				String accType = rset.getString("accType");
				double AccBal = rset.getDouble("balance");
//					(int accNo, int customerId, double balance, String accountType
				acc = new Account(accNumber, custId, AccBal, accType);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return acc;
	}

	@Override
	public boolean depositAmount(Account acc) {
		boolean b = false;
		String sql = "update account set balance=? where accno=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setDouble(1, acc.getBalance());
			pstatement.setInt(2, acc.getAccNo());

//			System.out.println(pstatement);
			int no = pstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

	public boolean withdrawAmount(Account acc) {
		boolean b = false;
		String sql = "update account set balance=? where accno=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setDouble(1, acc.getBalance());
			pstatement.setInt(2, acc.getAccNo());

//			System.out.println(pstatement);
			int no = pstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public List<Account> getAllAccounts() {
		String sql = "select * from Account";
		List<Account> accList = new ArrayList<>();
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql); // Statement
			ResultSet rset = pstatement.executeQuery();

			// selected data is available in rset
			while (rset.next()) {
				int accNumber = rset.getInt("accno");
				int custId = rset.getInt("customerID");
				String accType = rset.getString("accType");
				double AccBal = rset.getDouble("balance");
//						(int accNo, int customerId, double balance, String accountType
				Account acc = new Account(accNumber, custId, AccBal, accType);
				accList.add(acc);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return accList;

	}

}