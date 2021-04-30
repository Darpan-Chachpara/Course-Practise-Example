package lectutre.CoreJavaAssignment;

import java.util.Scanner;

class Number
{
	int a;
	int b;
	double result;
	Number(int x,int y)
	{
		a=x;
		b=y;
	}
	void add()
	{
		result=a+b;
		System.out.println(result);
	}
	void sub()
	{
		result=a-b;
		System.out.println(result);
	}
	void mul()
	{
		result=a*b;
		System.out.println(result);
	}
	void div()
	{
		if(b==0)
		{
			throw new ArithmeticException("B must be greater than zero....");
		}
		else
		{
		result=a/b;
		System.out.println(result);
		}
	}
	
}

public class Assignment_8_3_Number 
{

	public static void main(String[] args)
	{
		Number n=new Number(5,10);
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Exit");
		int choice;
		boolean quit=false;
		do
		{
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
		   switch(choice)
		   {
		     case 1:n.add();
		     break;
		
		     case 2:n.sub();
		     break;
		
		     case 3:n.mul();
		     break;
		
		     case 4:n.div();
		     break;
		
		     case 5:quit=true;
		     break;
		   }
		
		}while(!quit);
	}

}
