package lectutre;

public class VarargsMethod 
{
	void test(int i,String...args)
	{
		System.out.print("\n"+i);
		for(String s:args)
		{
			System.out.print(","+s);
		}
	}
	public static void main(String[] args)
	{
		VarargsMethod ob=new VarargsMethod();
		ob.test(100,"ABC","DEF","GHI");
		ob.test(200,"JKL","MNO","PQR");
		ob.test(300,"STU","VWX","YZ");
	}
}
