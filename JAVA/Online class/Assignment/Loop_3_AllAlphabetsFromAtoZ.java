package Assignment;

import java.util.Scanner;

public class Loop_3_AllAlphabetsFromAtoZ 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		System.out.println("ALPHABETS IN UPPERCASE ARE :");
		for(ch='A';ch<='Z';ch++)
		{
			System.out.println(ch+"");
		}
	}

}
