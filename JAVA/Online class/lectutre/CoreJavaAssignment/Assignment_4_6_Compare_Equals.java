package lectutre.CoreJavaAssignment;

public class Assignment_4_6_Compare_Equals {

	public static void main(String[] args) 
	{
		String s1 = "DARPAN"; //LITERAL WAY
		String s2 = "DARPAN";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 =new String("DARPAN"); //USING KEYWORD
		String s4 =new String("DARPAN");		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
