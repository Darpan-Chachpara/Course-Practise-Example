package Assignment;

import java.util.Scanner;

public class IfElse__8__InputAlphabetIsVowelOrConsonant
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER : \n");
		char ch=sc.next().charAt(0);
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
		{
			System.out.println("\n"+ch+" IS VOWEL");
		}
		else
		{
			System.out.println("\n"+ch+" IS CONSONANT");
		}
		sc.close();
	}

}
