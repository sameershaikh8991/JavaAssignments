package assignment30_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class CRUDDEMO {
	public static void main(String[] args) throws NumberFormatException, IOException {
		DynamicOp crud = new DynamicOp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch = 0;
		do {
			System.out.println("Operations on Accounts");
			System.out.println(
					"1: insert\n2: update\n3: delete\n4: search account \n5: select all\n6: Transfer money\n7: deposit money\n8: withdraw\n5: exit");
			ch = Integer.parseInt(br.readLine());
			switch (ch) {
			case 1:
				System.out.println("Enter Account details:");
				System.out.println("Enter Account Number:");
				int accNo = Integer.parseInt(br.readLine());

				System.out.println("Enter Customer ID");
				int customerId = Integer.parseInt(br.readLine());

				System.out.println("Account of Type");
				String accType = br.readLine();

				System.out.println("Enter Account Balance:");
				double accBal = Double.parseDouble(br.readLine());

				Account acc = new Account(accNo, customerId, accBal, accType);
				boolean b = crud.addAccount(acc);
				if (b)
					System.out.println("Account added.....");
				else
					System.out.println("Failed......");
				break;
			case 2:
				System.out.println("Update Acccount details:");
				System.out.println("Enter Account Number to update account type");
				accNo = Integer.parseInt(br.readLine());
				Account updateAcc = crud.getAccountByAccountNO(accNo);
				System.out.println("Enter new account type");
				accType = br.readLine();
				updateAcc.setAccountType(accType);
				b = crud.updateAccount(updateAcc);
				if (b)
					System.out.println(" updated........");
				else
					System.out.println("Failed............");
				break;
			case 3:
				System.out.println("Enter account Number to delete account");
				accNo = Integer.parseInt(br.readLine());
				b = crud.deleteAccount(accNo);
				if (b)
					System.out.println("Acccount deleted........");
				else
					System.out.println("Failed............");
				break;
			case 4:
				System.out.println("Enter existing Account Number to search Account");
				accNo = Integer.parseInt(br.readLine());
				Account searchedAcc = crud.getAccountByAccountNO(accNo);
				if (searchedAcc != null)
					System.out.println(searchedAcc);
				else
					System.out.println("Employee not found");
				break;
			case 5:
				List<Account> aList = crud.getAllAccounts();
				// method reference
				System.out.println(aList.size());
				if (aList.isEmpty())
					System.out.println("No Records to display....");
				aList.forEach(System.out::println);
				break;
			case 6:
				System.out.println("Enter Your account Number:");
				int sendaccNo = Integer.parseInt(br.readLine());

				System.out.println("Enter receiver account Number:");
				int reciverNo = Integer.parseInt(br.readLine());

				System.out.println("Amount you want to send:");
				int sendamount = Integer.parseInt(br.readLine());

				Account senderAccount = crud.getAccountByAccountNO(sendaccNo);
				Account revciverAccount = crud.getAccountByAccountNO(reciverNo);

				double sendercurrBal = senderAccount.getBalance();
				double recivercurrBal = revciverAccount.getBalance();

				if (sendamount <= sendercurrBal) {
					double newBal = sendercurrBal - sendamount;
					System.out.println("sender new bal:" + newBal);
					senderAccount.setBalance(newBal);
					b = crud.withdrawAmount(senderAccount);
					double revnewBal = recivercurrBal + sendamount;
					System.out.println(" reciver new bal:" + revnewBal);
					revciverAccount.setBalance(revnewBal);
					b = crud.depositAmount(revciverAccount);
					System.out.println("money successfully transferred to:" + reciverNo);

				}

				else
					System.out.println("insufficient balance");
				break;
			case 7:
				System.out.println("deposit money ");
				System.out.println("Enter your  Account Number");
				accNo = Integer.parseInt(br.readLine());

				System.out.println("Enter amount");
				int amount = Integer.parseInt(br.readLine());

				Account updateAcc1 = crud.getAccountByAccountNO(accNo);
				double currentBal = updateAcc1.getBalance();
				double newBal = currentBal + amount;
				updateAcc1.setBalance(newBal);
				b = crud.depositAmount(updateAcc1);
				if (b)
					System.out.println("Money deposit successfully........");
				else
					System.out.println("Failed............");
				break;
			case 8:
				System.out.println("withdraw money ");
				System.out.println("Enter your  Account Number");
				accNo = Integer.parseInt(br.readLine());
				updateAcc1 = crud.getAccountByAccountNO(accNo);
				currentBal = updateAcc1.getBalance();
				System.out.println("Your current balance:" + currentBal);
				System.out.println("Enter amount");
				amount = Integer.parseInt(br.readLine());

				newBal = currentBal - amount;
				updateAcc1.setBalance(newBal);
				b = crud.withdrawAmount(updateAcc1);
				if (b)
					System.out.println("Money deposit successfully........");
				else
					System.out.println("Failed............");
				break;

			default:
				System.out.println("Wrong choice");
			}
		} while (ch != 6);

	}
}