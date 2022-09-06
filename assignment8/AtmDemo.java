package assignment8;
import java.util.Scanner;

public class AtmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account ac=new Account(1234,5000);
		Operation op=new Operation();
		double amount;
		int ch;		
		do {
			System.out.println("Enter operation you want to perform: \n1: Deposit \n2: Withdraw \n3: Balance Enquiry \n 4: exit");
			ch=sc.nextInt();
		try {
			switch(ch) {
			case 1:
				 System.out.print("Enter amount to deposit: ");
	             amount = sc.nextDouble();
	             op.deposit(amount,ac);
	             System.out.println("Amount "+ amount + 
	                                     " deposited");
				break;
				
			case 2:
				System.out.print("Enter amount to withdraw: ");
	            amount = sc.nextDouble();
	            double withdrawalAmount = op.withdraw(amount,ac);
	            System.out.println("Collect "+ 
	                            withdrawalAmount+" cash");
				break;
				
			case 3:
				System.out.println("Current Balance:"+ op.balanceEnquiry(ac));
				break;
				
			case 4:
				break;	
				
			default:
				break;
			}
		}catch(InvalidAmountException|InsufficientBalanceException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		}while(ch!=4);
		

			
		
		
		
		
	
		

	}

}


