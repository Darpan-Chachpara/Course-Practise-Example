package Assignment;

import java.util.Scanner;

public class Basic__8__CelsiusTemperatureAndConvertIntoFahrenheit {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE TEMPERATURE IN CELCSIUS : ");
		double temp=sc.nextDouble();
		
		temp=((1.8*temp)-32);
		System.out.println("TEMPERATURE IN FAHRENHEIT : "+temp);
		sc.close();
	}

}
