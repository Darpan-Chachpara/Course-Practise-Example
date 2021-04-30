package lectutre.CoreJavaAssignment;

public class Assignment_3_5_Singleton
{

	public static void main(String[] args) 
	{
		Singleton x=Singleton.Singleton();//getInstance()
		Singleton y=Singleton.Singleton();//getInstance()
		Singleton z=Singleton.Singleton();//getInstance()
		x.s=(x.s).toUpperCase();
		
		System.out.println("value "+x.s);
		System.out.println("value "+y.s);
		System.out.println("value "+z.s);
		
		z.s=(z.s).toLowerCase();
		
		System.out.println("value "+x.s);
		System.out.println("value "+y.s);
		System.out.println("value "+z.s);

	}

}

class Singleton
{
	private static Singleton single_instance=null;
	public String s;
	private Singleton()
	{
		s="WELcome";
	}
	public static Singleton Singleton() //getInstance()
	{
		if(single_instance==null) {
			single_instance=new Singleton();
		}
		return single_instance;
	}
	
}