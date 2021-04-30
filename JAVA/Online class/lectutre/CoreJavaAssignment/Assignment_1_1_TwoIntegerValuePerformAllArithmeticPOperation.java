package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_1_TwoIntegerValuePerformAllArithmeticPOperation {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER THE FIRST NUMBER : ");
		int num1=sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER : ");
		int num2=sc.nextInt();
		
		int Addition=num1+num2;
		int Subtraction=num1-num2;
		int Multiplication=num1*num2;
		int Division=num1/num2;
		int Modulo=num1%num2;

		System.out.println("THE ADDITION OF TWO TUMBER IS : "+Addition);
		System.out.println("THE SUBTRACTION OF TWO NUMBER IS : "+Subtraction);
		System.out.println("THE MULTIPLICATION OF TWO NUMBER IS : "+Multiplication);
		System.out.println("THE DIVISION OF TWO NUMBER IS : "+Division);
		System.out.println("THE MODULO OF TWO NUMBER IS : "+Modulo);
		sc.close();
	}

}
