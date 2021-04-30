package Assignment;

import java.util.Scanner;

public class Basic__4__LengthBreadthOfRectangleFindItsPerimeter 
{

	public static void main(String[] args)
	{
		Scanner d=new Scanner(System.in);
		
		System.out.println("ENTER THE LENGTH OF THE RECTANGLE :");
		double l=d.nextDouble();
		System.out.println("ENTER THE BREADTH OF THE RECTANGLE :");
		double b=d.nextDouble();
		
		double perimeter=2*(l+b);
		System.out.println("PERIMETER OF RECTANGLE IS :"+perimeter);
		d.close();
		

	}

}
