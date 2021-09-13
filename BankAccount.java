package Problem1;

public class BankAccount 
{
	public String name;
	public String id;
	public double balance;
	
	public BankAccount(String n, String d, double b) 
	{
		name = n;
		id = d;
		balance = b;
	}
   public BankAccount()
     {
			}

	public void deposit(double depAmount) 
	{
		balance+=depAmount;
	}
	
	public void withdraw(double withAmount)
	{
		if((balance-withAmount)>0) 
			balance-=withAmount;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void display()
	{
			System.out.println("Name: "+name+"\nID: "+id+"\nBalance: "+balance);
	}
}
