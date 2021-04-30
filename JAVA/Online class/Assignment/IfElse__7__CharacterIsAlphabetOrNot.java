package Assignment;

import java.util.Scanner;

public class IfElse__7__CharacterIsAlphabetOrNot 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER A CHARACTER : ");
		char ch=sc.next().charAt(0);   //Syntax to remember
		
		if((ch>='a' && ch<='z')  ||  (ch>='A' && ch<='Z'))
		{
			System.out.println(ch+"  IS AN ALPHABET");
		}
		else
		{
			System.out.println(ch+"  IS NOT AN ALPHABET");
		}
		sc.close();
	}

}
