package lectutre.CoreJavaAssignment;
import java.util.*; 
public class Assignment_13_2_Iterator_Foreach
{
	public static void main(String[] args)
	{
		 List colors=new ArrayList();
		    colors.add("Red"); 
		    colors.add("Green"); 
		    colors.add("Blue"); 
		    colors.add("Black");
		    colors.add("White");
		    colors.add("Yellow");
		    System.out.println("The contents of the list using Iterator:" );
		   
		   Iterator<String> c=colors.iterator();
		      while(c.hasNext()) 
		        { 
		            String str=c.next(); 
		            System.out.print(str  +  " ");
		            
		         }  
	}

}
