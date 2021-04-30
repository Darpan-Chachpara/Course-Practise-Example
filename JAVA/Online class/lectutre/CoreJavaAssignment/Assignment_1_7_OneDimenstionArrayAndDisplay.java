package lectutre.CoreJavaAssignment;

import java.util.Scanner;

public class Assignment_1_7_OneDimenstionArrayAndDisplay {

	public static void main(String[] args)
	{
		int arr[]=new int[50];  //Declare and Allocate
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF THE ARRAY : ");
		num=sc.nextInt();
		System.out.println("ENTER "+num+" ELEMENTS IN THE ARRAY : ");
		for(i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("ELEMENTS IN ARRAY ARE : \n");
		for(i=0;i<num;i++)
		{
			System.out.println(arr[i]+"");
		}

	}

}
