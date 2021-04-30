package lectutre.CoreJavaAssignment;
import java.util.Random;

class Medicine
{
	public void displayLabel(String name, String Address)
	{
		System.out.println("Medicine Name :" +name);
		System.out.println("Medicine Address : "+Address);
	}
}

class Tablet extends Medicine
{
	public void displayLabel(String name, String Address)
	{
		super.displayLabel(name, Address);
		System.out.println("Store in cool and dry place");
	}
	
}

class Syrup extends Medicine
{
	public void displayLabel(String name, String Address)
	{
		super.displayLabel(name, Address);
		System.out.println("VISIT DOCTOR BEFORE USING ANYTHING .");
	}
	
}

class Ointment extends Medicine
{
	public void displayLabel(String name, String Address)
	{
		super.displayLabel(name, Address);
		System.out.println("AT WAHT TIME TO TAKEN MEDICINE");
	}
	
}


public class Assignment_6_2_TestMedicine 
{

	public static void main(String[] args)
	{
		Medicine m[]= new Medicine[10];
		Random rnd = new Random();
		
		for(int i=0;i<10;i++)
		{
			int num=rnd.nextInt(5); // and random number between 0 and 
			if(num==1)
			{
				m[i]= new Tablet();
				m[i].displayLabel("VITAMIN C ", "MUMBAI");
			}
			else if(num==2)
			{
				m[i]= new Syrup();
				m[i].displayLabel("VITAMIN D","THANE");
			}
			else if(num==3)
			{
				m[i]= new Ointment();
				m[i].displayLabel(" VITAMIN E","DELHI");
			}
			else if(num==4)
			{
				m[i]= new Ointment();
				m[i].displayLabel(" VITAMIN F","PUNE");
			}
			else
			{
				m[i]= new Ointment();
				m[i].displayLabel(" VITAMIN G","PUNJAB");
			}
			
			System.out.println();
		}
		
	}

}
