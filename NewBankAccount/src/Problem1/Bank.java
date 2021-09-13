package Problem1;
import java.util.Scanner;
public class Bank
{
	
		public static void main(String[] args) 
		
		{
			Scanner scan = new Scanner(System.in);
			String s1, s2; 
			System.out.print("Enter Your Name: ");
			s1 = scan.nextLine();
			System.out.print("Enter Your ID: ");
			s2 = scan.nextLine();
			System.out.print("Enter Your Balance: ");
			double a = scan.nextDouble();
			BankAccount x = new BankAccount(s1,s2,a);
			
			while(true) 
			{
				double z;
				System.out.print("Menu\n"+"Enter 1 to Deposit\n"+"Enter 2 to Withdraw\n"+"Enter 3 to Display The Balance\n"+"Enter 0 to Exit\n");
				System.out.print("Enter Your Choice: ");
				int c = scan.nextInt();
				if(c==0) break;
				else if(c==1) 
				{
					System.out.print("Enter The Amount You want to Deposit: ");
					z = scan.nextDouble();
					x.deposit(z);
				}
				else if(c==2) 
				{
					System.out.print("Enter The Amount You want to Withdraw: ");
					z = scan.nextDouble();
					x.withdraw(z);
				}
				else if(c==3) 
				{
					System.out.print("Your Balance is: "+x.getBalance());
				}
				System.out.println();
			}
			scan.close();
		}
	  
	
}
