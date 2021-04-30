package lectutre.CoreJavaAssignment;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Assignment_4_5_SplitString {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s= scan.nextLine();
		
		StringTokenizer st =new StringTokenizer(s); // TO BREAK STRING INTO TOKEN
		System.out.println("THE NUMBER OF TOKEN ARE:"+st.countTokens()); //counting tokens
		System.out.println(st.hasMoreTokens()); //checking for any tokens
		while(st.hasMoreTokens()) //CHECH WEATHER THERE ARE ANY MORE TOKEN AVAILABLE WITH current function
		{
			System.out.println("THE FLOW OF TOKENS:"+st.nextToken());
		}
	}

}
