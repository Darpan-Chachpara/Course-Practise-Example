package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_8_OneDimensionalArrayDisplaySum {

	public static void main(String[] args) 
	{
		int arr[]=new int[50];  //Declare and Allocate
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY : ");
		num=sc.nextInt();
		System.out.println("ENTER "+num+" ELEMENTS IN THE ARRAY : ");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println("SUM OF ALL ELEMENTS ARE : "+sum);
	}
}
