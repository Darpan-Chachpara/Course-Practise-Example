package lectutre.CoreJavaAssignment;

import java.util.Scanner;

class BankAccount
{
	Scanner scan = new Scanner(System.in);
	 String name, acctype;
	 int accno, bal, amt;
	 
	 public BankAccount( String name, String acctype, int accno, int bal) {
		super();
		
		this.name = name;
		this.acctype = acctype;
		this.accno = accno;
		this.bal = bal;
		
	}
	int Deposit()
	{
		System.out.println("Enter amount to deposit:");
		amt=scan.nextInt();
		if(amt<0)
		{
			System.out.println("Invalid Amount");
			return 1;
		}
		bal =  bal + amt;
		return 0;
	}

	int Withdraw()
	{
		System.out.println("Your Balance = " +bal);
		System.out.println("Enter amount to withdraw:");
		
		amt = scan.nextInt();
		if(bal<amt)
		{
			System.out.println("Not Sufficient balance ");
			return 1;
		}
		if(amt<0)
		{
			System.out.println("Amount should be more than 0");
			return 1;
		}
		bal = bal - amt;
		return 0;
	}
	void Display()
	{
		System.out.println("Name: "+name);
		System.out.println("Account No : " +accno);
		System.out.println("Initial Balance : " +bal);
		System.out.println("Available balance: " +bal);
	}
	
	public String toString()
	{
		return "Available balance: " +bal;
	}
}
public class Assignment_3_1_Account 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you name:");
		String name = sc.next();
		System.out.println("Enter account no:");
		int accno = sc.nextInt();
		System.out.println("Enter accoun type:");
		String acctype = sc.next();
		System.out.println("Enter initial balance:");
		int bal =  sc.nextInt();
		
		BankAccount b = new BankAccount(name, acctype, accno, bal);
		int Menu;
		System.out.println("Menu");
		System.out.println("1. deposit Amount");
		System.out.println("2. Withdraw Amount");
		System.out.println("3. Display Details");
		System.out.println("4. Exit");
		Boolean quit = false;
		
		do
		{
			System.out.println("Please enter ur choice");
			Menu = sc.nextInt();
			switch(Menu)
			{
			case 1:
				b.Deposit();
				System.out.println(b.toString());
				break;
			case 2:
				b.Withdraw();
				System.out.println(b.toString());
				break;	
			case 3:
				b.Display();
				break;
			case 4:
				quit = true;
				break;
			}
		}
		while(!quit);
	}

}
