package Assignment;

import java.util.Scanner;

public class Basic__11__PowerOfAnyNumber
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE BASE : ");
		double base=sc.nextDouble();
		System.out.println("ENTER THE EXPONENT :");
		double exponent=sc.nextDouble();
		
		double power=Math.pow(base,exponent);
		System.out.println("THE RESULT OF "+base+" power "+exponent+" is : "+power);
		sc.close();
	}

}
