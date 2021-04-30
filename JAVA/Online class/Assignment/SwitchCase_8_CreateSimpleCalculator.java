package Assignment;

import java.util.Scanner;

public class SwitchCase_8_CreateSimpleCalculator
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER CHOICE : ( + : - : * : / : % )");
		char operation=sc.next().charAt(0);
		System.out.println("ENTER THE FIRST NUMBER :");
		int num1=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER :");
		int num2=sc.nextInt();
		
		switch(operation)
		{
		case '+':
			int result=num1+num2;
			System.out.println("\n THE ADDITION OF : "+num1+" + "+num2+" = "+result);
			break;
			
		case '-':
			 int result1=num1-num2;
			System.out.println("\n THE ADDITION OF : "+num1+" - "+num2+" = "+result1);
			break;
			
		case '*':
			 int result2=num1*num2;
			System.out.println("\n THE ADDITION OF : "+num1+" * "+num2+" = "+result2);
			break;
			
		case '/':
			 int result3=num1/num2;
			System.out.println("\n THE ADDITION OF : "+num1+" / "+num2+" = "+result3);
			break;
			
		case '%':
			 int result4=num1%num2;
			System.out.println("\n THE ADDITION OF : "+num1+" % "+num2+" = "+result4);
			break;
			
			default :
				System.out.println("\n INVALID OPERATION");
		}

	}

}
