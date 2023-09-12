package Declaration;

public class BankAcount {
	long AccountNumber;
	double balance;
	
	public BankAcount(long AccountNumber,double balance) {
		// TODO Auto-generated constructor stub
		super();
		this.AccountNumber=AccountNumber;
		this.balance=balance;
	}
	
	public void setaccountNumber(long AccountNumber)
	{
		this.AccountNumber=AccountNumber;
	}
	public long getaccountNumber()
	{
		return AccountNumber;
	}
	
	public void setaccountNumber(double balance)
	{
		this.balance=balance;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void currentBalance()
	{
		System.out.println("Current Blance is:"+balance);
	}
	
	public void deposite(double amount)
	{
		this.balance = balance+amount;
		System.out.println("Amount Credited in your Acoount :"+amount);
	}
	
	public void withdrawal(double amount)
	{
		if(balance>amount)
		{
			this.balance=balance-amount;
		}
		else
		{
			System.out.println("Insufficient Balance in your Account");
		}
	}
	
	void AccountDetails()
	{
		System.out.println("Account Number"+AccountNumber);
		System.out.println();
		System.out.println("Balance"+balance);
		System.out.println();
	}
	
	public void BalanceEnquiry()
	{
		this.AccountDetails();
	}

}
