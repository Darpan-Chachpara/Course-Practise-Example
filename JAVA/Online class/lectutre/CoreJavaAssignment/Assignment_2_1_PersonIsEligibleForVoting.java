package lectutre.CoreJavaAssignment;
import java.util.Scanner;
public class Assignment_2_1_PersonIsEligibleForVoting
{

	public static void main(String[] args)
	{
				Scanner sc=new Scanner(System.in);
				System.out.println("ENTER YOUR AGE : ");
				int age=sc.nextInt();
				
				if(age>=18)
				{
					System.out.println("\n YOU ARE ELIGIBLE TO VOTE BUT YOUR GOVERNMENT ID CARD WILL BE MANDATORY FOR FURTHER PROCESS.");
				}
				else
				{
					System.out.println("\n YOU ARE NOT ELIGIBLE TO VOTE.");
				}
				sc.close();
	}

}
