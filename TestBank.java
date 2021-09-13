package Problem1;

import java.util.Scanner;

public class TestBank 
{
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		BankAccount[] x = new BankAccount[100];
		BankAccount acc;
		while(true) 
		{
			int option = getUserInput();
			double z;
			switch(option) 
			{
			case 0: 
				System.exit(0);
				
			case 1:
				int i;
				String s1, s2; 
				System.out.print("Enter Your Name: ");
				s1 = scan.nextLine();
				scan.nextLine();
				System.out.print("Enter Your ID: ");
				s2 = scan.nextLine();
				System.out.print("Enter Your Balance: ");
				double a = scan.nextDouble();
				acc = new BankAccount(s1,s2,a);
				for(i=0; i<x.length; i++)
				{
					if(x[i] == null)
					{
						x[i] = acc;
						break;
					}
				}
				break;
				
			case 2: 
				 System.out.print("Enter Your ID: ");
				 s1 = scan.nextLine();
				 scan.nextLine();
				 acc = findacc(x,s1);
				 if(acc != null) 
				  {	
					 acc.display();
					 
				  }
				 else
				  {
					 System.out.print("Account Not available");
					
				  }
				 break;  
			         		
			case 3:
				System.out.print("Enter Your ID: ");
				s1 = scan.nextLine();
				scan.nextLine();
				acc = findacc(x,s1);
				if(acc != null) 
				 {	
					System.out.print("Enter The Amount You want to Deposit: ");
					z = scan.nextDouble();
					acc.deposit(z);
					
				 }
				else
				 {
					 System.out.print("Account Not available");
					
				 }
				break;
						
				 			
			case 4:
				System.out.print("Enter Your ID: ");
				s1=scan.nextLine();
				scan.nextLine();
				acc = findacc(x,s1);
				if(acc != null) 
				 {
						System.out.print("Enter The Amount You want to Withdraw: ");
						z = scan.nextDouble();
						acc.withdraw(z);
				 }
				else
				 {
					 System.out.print("Account Not available");
				 }
				break;
				
			
			case 5:
				System.out.print("Enter Your ID: ");
				s1 = scan.nextLine();
				scan.nextLine();
				acc = findacc(x,s1);
				if(acc != null) 
				 {
						System.out.print("Your Balance is: "+acc.getBalance());
					
				 }
				else
				 {
					 System.out.print("Account Not available");
					
				 }
				break;
				
			case 6:
				for(i=0; i<x.length; i++) 
				    {
						   x[i].display();
				
			        }
				break;
				
			default:
				break;	    
					
		 }
	 }

 }
	
	public static int getUserInput()
	{
		System.out.print("\nMenu\n"+"Enter 1 to Create New Account.\n"+"Enter 2 to Display Your Account Details.\n"+"Enter 3 to Deposit\n"+"Enter 4 to Withdraw\n"+"Enter 5 to Display The Balance\n"+"Enter 6 to Display All Account Details.\n"+"Enter 0 to Exit\n");
		System.out.print("Enter Your Choice: ");
		int option = scan.nextInt();
		return option;		
	}
	
	public static BankAccount findacc(BankAccount [] x, String n)
	{
	  int i;
	  for(i=0; i<x.length; i++) 
		{
		   if(x[i]==null)
		   {
			    return null;
		   }
			   
		   else if(x[i].id.equals(n))
			{
				return x[i];
			}
			
	    }
	  return null;

  }
}










