package lectutre.CoreJavaAssignment;

public class Assignment_4_7_AdditionOfDigit {

	public static void main(String[] args)
	{
		String s = new String("14abc9kj");
		int sum =0 ;
		
		for(int i=0;i<s.length();i++)
		{
			int a=0;
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				a= Character.getNumericValue(s.charAt(i)); //convert character into integer value
				System.out.println(a);
			}
			else
			{
				a=0;
				System.out.println(a);			
			}
			sum =sum +a;
		}
		System.out.println("Sum of digit is :"+sum);
	}

}
