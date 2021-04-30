package Assignment;

import java.util.Scanner;

public class IfElse__18__CalculateProfitOrLoss 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SELLING PRICE OF THE PRODUCT : ");
		double SP=sc.nextDouble();
		System.out.println("ENTER THE COST PRICE OF THE PRODUCT : ");
		double CP=sc.nextDouble();
		
		if(SP>CP)
		{
			double amount=SP-CP;
			System.out.println("PROFIT IS OF "+amount+" Rs");
		}
		else if(CP>SP)
		{
			double amount=CP-SP;
			System.out.println("LOSS IS OF "+amount+" Rs");
		}
		else
		{
			System.out.println("NO PROFIT NO LOSS ");
		}
		sc.close();
	}

}
