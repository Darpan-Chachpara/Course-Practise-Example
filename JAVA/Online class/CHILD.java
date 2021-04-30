class Parent 
{
	public void PAPA()
	{
		System.out.println("PAPA");
	}
}

public class CHILD //extends Parent
{
	public static void main(String[] args)
	{
		//CHILD c=new CHILD();
		//c.PAPA();
		
		Parent p=new Parent();
		p.PAPA();
	}

}
