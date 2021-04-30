package lectutre;

public class OVERRIDING {

	public static void main(String[] args)
	{
		Beta c=new Beta();
		c.show();
	}

}

class Father
{
	void show()
	{
		System.out.println("IN PARENT");
	}
}


class Beta extends Father
{
	void show()
	{
		System.out.println("IN CHILD");
	}
}