package lectutre.CoreJavaAssignment;

import java.util.Scanner;
class InsufficientFundsException extends Exception
{
	InsufficientFundsException(String str)
	{
		super(str);
	}
}
class Account
{
	static Scanner input=new Scanner(System.in);
	String Name ,Actype;
	int Accno, bal, amt;
	
	Account(String name,int accno, String actype, int bal)
	{
		Name=name;
		Accno=accno;
		Actype=actype;
		this.bal=bal;
	}
	
	int Deposit()
	{
		System.out.println("ENTER AMOUNT TO DEPOSIT:");
		amt=input.nextInt();
		if(amt<0)
		{
			System.out.println("INVALID AMOUNT");
			return 1;
		}
		bal=bal+amt;
		return 0;
	}
	
	int Withdraw()throws InsufficientFundsException
	{
		System.out.println("YOUR BALANCER="+bal);
		System.out.println("ENTER AMOUNT TO WITHDRAW:");
		amt=input.nextInt();
		if(bal<amt || amt<0)
		{
			throw new InsufficientFundsException("WITHDRAW AMOUNT MUST BE LESS THAN BALANCE...");
			
		}
				bal=bal-amt;
		return 0;
	}
	
	void Display()
	{
		System.out.println("NAME:"+Name);
		System.out.println("ACCOUNT NO:"+Accno);
		System.out.println("INITIAL BALANCE:"+bal);
		System.out.println("AVAILABLE BALANCE:"+bal);
	}
	
	public String tostring()
	{
		return "AVAIILABLE BALANCE:"+bal;
	}
	

}

public class Assignment_8_4_AccountException 
{

	public static void main(String[] args) throws InsufficientFundsException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ACCOUNT HOLDER NAME:");
		String name=sc.nextLine();
		System.out.println("ENTER ACCOUNT NUMBER:");
		int accno=sc.nextInt();
		System.out.println("ENTER ACCOUNT TYPE:");
		String actype=sc.next();
		System.out.println("ENTER INITIAL BALANCE:");
		int bal=sc.nextInt();
		Account B=new Account(name,accno,actype,bal);
		int Menu;
		System.out.println("MENU");
		System.out.println("1.DEPOSIT AMOUNT");
		System.out.println("2.WITHDRAW AMOUNT");
		System.out.println("3.DISPLAY DETAILS");
		System.out.println("4.EXIT");
		boolean quit=false;
		do 
		{
			System.out.println("PLEASE ENTER YOUR CHOICE:");
			Menu=sc.nextInt();
			switch(Menu)
			{
			case 1:
				B.Deposit();
				System.out.println(B.tostring());
				break;
				
			case 2:
				B.Withdraw();
				System.out.println(B.tostring());
				break;
				
			case 3:
				B.Display();
				break;
				
			case 4:
				quit=true;
				break;
			}
		}while(!quit);
		

	}

}
