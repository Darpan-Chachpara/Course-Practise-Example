package lectutre.CoreJavaAssignment;
import java.util.*;
public class Assignment_13_4_MenuDriven 
{
	public static void main(String[] args) 
	{
		 
			  List l = new ArrayList();
			  l.add("Red");
			  l.add("Green");
			  l.add("Orange");
			  l.add("White");
			  l.add("Black");
			  
			  System.out.println(l);
			  
			  String element = (String) l.get(0);
			  System.out.println("First element: "+element);
			  l.add(0, "Darpan");
			  System.out.println("After inserting Darpan at 1st position:"  + l);
			  l.set(1, "Meet");
			  System.out.println("After updating the value of 1st index: " + l);
			  l.remove("White"); 
		      System.out.println("List after removing White:"+ l); 
		      boolean search = l.contains("Black");
		      System.out.println("Search Result: " +search);
		      
		      Collections.reverse(l);
		      System.out.println("After Reverse Order, ArrayList Contains : " + l);
		      
		      System.out.println("Before Sorting: "+ l);   
		      Collections.sort(l);   
		      System.out.println("After Sorting: "+ l); 
	}

}
