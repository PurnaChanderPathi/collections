package Declaration;

import java.util.Scanner;

public class BankAccountMain {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Account Number");
		long Accnum = scn.nextLong();
		
		System.out.println("Enter balance");
		double bal = scn.nextDouble();
		
		BankAcount bank = new BankAcount(Accnum, bal);
		bank.AccountDetails();
		scn.nextLine();
		
		System.out.println("***Bank Operations are:");
		System.out.println("For Deposit Press 1");
		System.out.println("For Withdraw press 2");
		System.out.println("For Balance Enquiry Press 3");
		System.out.println("For Account Details Press 4");
		System.out.println("For Exit Press 5");
		System.out.println("Choose Your Operator");
		int userResponce = scn.nextInt();
		
		if(userResponce == 1)
		{
			System.out.println("How Much Money You Want To Deposit");
			double amount = scn.nextDouble();
			bank.deposite(amount);
			scn.hasNextLine();
			bank.BalanceEnquiry();
		}
		else if(userResponce == 2)
		{
			System.out.println("How Much Money You Want To Withdraw");
			double amount = scn.nextDouble();
			bank.withdrawal(amount);
			scn.hasNextLine();
			bank.BalanceEnquiry();
		}
		else if(userResponce == 3)
		{
			bank.BalanceEnquiry();
		}
		else if(userResponce == 4)
		{
			bank.AccountDetails();
		}
		
	
	}		


}