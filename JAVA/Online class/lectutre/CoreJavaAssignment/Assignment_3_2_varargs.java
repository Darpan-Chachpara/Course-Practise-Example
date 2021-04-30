package lectutre.CoreJavaAssignment;

public class Assignment_3_2_varargs 
{						//datatype variablename
	 static void display(int num, String... values){  
		  System.out.println("number is "+num);  
		  for(String s:values){  
		   System.out.println(s);  
		  }  
		 }  
	public static void main(String[] args) 
	{
		display(1,"hey");  
		 display(100,"i","am","happy in ","varargs");
	}

}
