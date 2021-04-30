package Assignment;

import java.util.Scanner;

public class Basic__17__EnterPTRCalculateSimpleInterest
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER PRINCIPLE : ");
		double p=sc.nextDouble();
		System.out.println("ENTER RATE : ");
		double r=sc.nextDouble();
		System.out.println("ENTER TIME : ");
		double t=sc.nextDouble();
		
		double SI=(p*r*t)/100;
		System.out.println("\n SIMPLE INTEREST IS : "+SI);
		sc.close();
		
	}

}
