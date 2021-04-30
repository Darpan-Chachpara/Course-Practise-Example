package lectutre.CoreJavaAssignment;

import java.lang.Math;
interface MyMath
{
	double Square(double a);
	double Cube(double a);
	double cosine(double a);
	double sine(double a);
}

class impMath implements MyMath
{ 
	double a;
	public impMath() 
	{
		super();
		this.a =a;		
	}
	
	public double Square(double a)
	{
		System.out.println("Square of " +a+" = " +a*a);
		return a*a;
	}
	
	public double Cube(double a)
	{
		System.out.println("Cube of " +a+" = " +a*a*a);
		return a*a*a;
	}
	
	public double cosine(double a)
	{
		System.out.println("Cosine of " +a+ " ="+Math.cos(a) );
		return Math.cos(a);
	}
	
	public double sine(double a)
	{
		System.out.println("Cosine of " +a+ " ="+Math.sin(a) );
		return Math.sin(a);
	}

	
}

public class Assignment_7_2_MathDemo {

	public static void main(String[] args)
	{
		impMath m =new impMath();
		m.Square(25);
		m.Cube(3);
		m.cosine(90);
		m.sine(45);
	}

}
