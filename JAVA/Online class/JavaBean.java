
public class JavaBean
{

	public static void main(String[] args)
	{
		JavaBean b=new JavaBean();
		b.setHeight(5);
		System.out.println(b.getHeight());
	}

	private int height;
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	public int getHeight()
	{
		return height;
	}
}


class mno
{
public static void main(String[] args) 
{
	JavaBean b=new JavaBean();
	b.setHeight(100);
	//b.height=420;
	System.out.println();
}
}