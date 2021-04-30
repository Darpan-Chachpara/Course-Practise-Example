package lectutre;

public class OVERRLOADING
{

	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.show();
		d.show(100);
	}

}

class Demo
{
	void show()
	{
		System.out.println("IN SHOW....");
	}
	
	void show(int i)
	{
		System.out.println("IN SHOW BUT "+i);
	}
}