package Assignment;

import java.util.Scanner;

public class Basic__6__EnterRadiusFindDiameterCircumferenceArea {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS OF CIRCLE : ");
		double radius=sc.nextDouble();
		
		double diameter=2*radius;
		double circumference=2*Math.PI*radius;
		double area=Math.PI*radius*radius;
		
		System.out.println("THE DIAMETER OF THE CIRCLE IS : "+diameter);
		System.out.println("THE CIRCUMFERENCE OF THE CIRCLE IS : "+circumference);
		System.out.println("THE AREA OF THE CIRCLE IS : "+area);
		sc.close();
		
	}

}
