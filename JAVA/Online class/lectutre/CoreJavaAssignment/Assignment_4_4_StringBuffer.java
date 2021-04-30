package lectutre.CoreJavaAssignment;

public class Assignment_4_4_StringBuffer {

	public static void main(String[] args)
	{
		StringBuffer s =new StringBuffer("DARPANCHACHPARA");
		System.out.println(s.capacity());  //default 12
		System.out.println(s.append("HERO"));
		System.out.println(s.length());
		System.out.println(s.insert(0,"OM"));
		System.out.println(s.insert(6,5));
		System.out.println(s.delete(0,4));
		System.out.println(s.reverse());
	}

}
