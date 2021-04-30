package Assignment;

import java.util.Scanner;

public class IfElse__10__CharacterIsUppercaseOrLowercase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER : ");
		char ch=sc.next().charAt(0);
		if(ch>='a' && ch<='z')
		{
			System.out.println("\n"+ch+" IS A LOWERCASE CHARACTER");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println("\n"+ch+" IS A UPPERCASE CHARACTER");
		}
		else
		{
			System.out.println("\nWRONG INPUT");
		}
		sc.close();
	}

}
