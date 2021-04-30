package Assignment;

import java.util.Scanner;

public class Basic__9__FahrenheitTemperautreConvertIntoCelsius {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE TEMPERATURE IN FAHRENHEIT : ");
		double temp=sc.nextDouble();
		
		temp=((temp-32)*5/9);
		System.out.println("TEMPERATURE IN CELSIUS : "+temp);
		sc.close();
	}

}
