package lectutre.CoreJavaAssignment;

public class Assignment_6_1_Instruments 
{

	public static void main(String[] args)
	{
		instrument n[] =new instrument[10];
		for(int i=0;i<10;i++)
		{
			if(i==1 || i==2 || i==3)
			{
				n[i]=new Piano();
			}
		    else if(i==4 || i==5 || i==6)
		    {
		    	n[i]=new Flute();	
		    }
			else
			{
				n[i]=new Guitar();
			}	
			n[i].play();
			if(n[i] instanceof Piano)
				System.out.println("InstanceOf Piano");
			else if(n[i] instanceof Flute)
				System.out.println("InstanceOf Flute");
			else
				System.out.println("InstanceOf Guitar");
		}	
	}

}


abstract class instrument
{
	  abstract void play();
}
class Piano extends instrument
	{
		public void play()
		{
			System.out.println("Piano is playing tan tan tan");
			
		}
	}
	
	 class Flute  extends instrument
	{
		public void play()
		{
			System.out.println("Flute is playing toot toot toot");
		}
	}
	
	 class Guitar  extends instrument
	{
		public void play()
		{
			System.out.println("Guitar is playing tin tin tin");
		}
	}
