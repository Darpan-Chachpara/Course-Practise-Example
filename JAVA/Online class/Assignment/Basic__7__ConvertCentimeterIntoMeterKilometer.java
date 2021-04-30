package Assignment;

import java.util.Scanner;

public class Basic__7__ConvertCentimeterIntoMeterKilometer {

	public static void main(String[] args)
	{
		//@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE LENGTH IN CENTIMETER :");
		double centimeter=sc.nextDouble();
		
		double meter=centimeter/100.0;
		double kilometer=centimeter/1000.0;
		
		System.out.println("LENGTH IN METER = "+meter+" meter");
		System.out.println("LENGTH IN KILOMETER = "+kilometer+" kilometer");
		sc.close();
	}

}
