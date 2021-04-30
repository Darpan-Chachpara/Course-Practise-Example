package lectutre;

public class Example 
{
	static int i;
	int j;

	public static void main(String[] args) 
	{
		Example sc=new Example();
		Example sc1=new Example();
		sc.i=3;
		sc.j=4;
		sc1.i=5;
		sc1.j=6;

		System.out.println(sc.i+":"+sc.j+":"+sc1.i+":"+sc1.j);

	}

}
