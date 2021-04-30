package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_2_ArithmeticOperationWithDifferentDataType {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("ENTER THE FIRST NUMBER : ");
		double num1=sc.nextDouble();
		System.out.println("ENTER THE SECOND NUMBER : ");
		double num2=sc.nextDouble();
		
		double Addition=num1+num2;
		double Subtraction=num1-num2;
		double Multiplication=num1*num2;
		double Division=num1/num2;
		double Modulo=num1%num2;

		System.out.println("THE ADDITION OF TWO TUMBER IS : "+Addition);
		System.out.println("THE SUBTRACTION OF TWO NUMBER IS : "+Subtraction);
		System.out.println("THE MULTIPLICATION OF TWO NUMBER IS : "+Multiplication);
		System.out.println("THE DIVISION OF TWO NUMBER IS : "+Division);
		System.out.println("THE MODULO OF TWO NUMBER IS : "+Modulo);
		sc.close();
		
		/*
		 * 
		 * 
		 * 
		 Scanner in=new Scanner(System.in);	
			System.out.println("ENTER THE FIRST NUMBER : ");
			float num1=in.nextFloat();
			System.out.println("ENTER THE SECOND NUMBER : ");
			float num2=in.nextFloat();
			
			float Addition=num1+num2;
			float Subtraction=num1-num2;
			float Multiplication=num1*num2;
			float Division=num1/num2;
			float Modulo=num1%num2;

			System.out.println("THE ADDITION OF TWO TUMBER IS : "+Addition);
			System.out.println("THE SUBTRACTION OF TWO NUMBER IS : "+Subtraction);
			System.out.println("THE MULTIPLICATION OF TWO NUMBER IS : "+Multiplication);
			System.out.println("THE DIVISION OF TWO NUMBER IS : "+Division);
			System.out.println("THE MODULO OF TWO NUMBER IS : "+Modulo);
			in.close();
			
			
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE FIRST NUMBER : ");
			long num1=sc.nextLong();
			System.out.println("ENTER THE SECOND NUMBER : ");
			long num2=sc.nextLong();
						
			long Addition=num1+num2;
			long Subtraction=num1-num2;
			long Multiplication=num1*num2;
			long Division=num1/num2;
			long Modulo=num1%num2;

			System.out.println("THE ADDITION OF TWO TUMBER IS : "+Addition);
			System.out.println("THE SUBTRACTION OF TWO NUMBER IS : "+Subtraction);
			System.out.println("THE MULTIPLICATION OF TWO NUMBER IS : "+Multiplication);
			System.out.println("THE DIVISION OF TWO NUMBER IS : "+Division);
			System.out.println("THE MODULO OF TWO NUMBER IS : "+Modulo);
			sc.close();
			
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE FIRST NUMBER : ");
			short num1=sc.nextShort();
			System.out.println("ENTER THE SECOND NUMBER : ");
			short num2=sc.nextShort();
						
			short Addition=num1+num2;
			short Subtraction=num1-num2;
			short Multiplication=num1*num2;
			short Division=num1/num2;
			short Modulo=num1%num2;

			System.out.println("THE ADDITION OF TWO TUMBER IS : "+Addition);
			System.out.println("THE SUBTRACTION OF TWO NUMBER IS : "+Subtraction);
			System.out.println("THE MULTIPLICATION OF TWO NUMBER IS : "+Multiplication);
			System.out.println("THE DIVISION OF TWO NUMBER IS : "+Division);
			System.out.println("THE MODULO OF TWO NUMBER IS : "+Modulo);
			sc.close();
						
			
		 */

	}

}
