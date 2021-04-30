package Assignment;

import java.util.Scanner;

public class IfElse__9__InputCharacterIsAlphabetDigitSpecialCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE KEYWORD : ");
		char ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println("\n"+ch+" IS A ALPHABET");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("\n"+ch+" IS A DIGIT");
		}
		else
		{
			System.out.println("\n"+ch+" IS A SPECIAL CHARACTER");
		}
		sc.close();
	}

}
