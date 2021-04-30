package Assignment;

import java.util.Scanner;

public class SwitchCase__3__AlphabetIsVowelOrConsonant {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ALPHABET : ");
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'e':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'i':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'o':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'u':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'A':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'E':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'I':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'O':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
		case 'U':
			System.out.println("\n"+ch+" IS VOWEL");
			break;
			default :
				System.out.println("\n"+ch+" IS CONSONENT");
			
		}
		sc.close();
	}

}
