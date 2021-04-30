package Assignment;

import java.util.Scanner;

public class IfElse__20__GrossSalary
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE BASIC SALARY OF AN EMPLOYEE : ");
		double basic=sc.nextDouble();
		double da,hra;
		if(basic<=1000)
		{
			 da=basic*0.8;
			 hra=basic*0.2;
		}
		else if(basic<=2000)
		{
			 da= basic*0.8;
			 hra=basic*0.2;	
		}
		else
		{
			da=basic*0.95;
			hra=basic*0.3;
		}
		double GROSS=basic+hra+da;
		System.out.println("\n"+GROSS+" IS THE GROSS SALARY OF THE EMPLOYEE");
		sc.close();
}
}