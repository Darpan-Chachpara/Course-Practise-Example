package lectutre.CoreJavaAssignment;
import java.util.*; 
public class Assignment_13_2_CollectionDemo
{
	public static void main(String[] args)
	{
	       List h = new ArrayList();
	        h.add("Darpan"); 
	        h.add("Meet"); 
	        h.add("Bhargav"); 
	        h.add("Darshan"); 
	        h.add("Dhaval"); 

	  
	        System.out.println(h); 
	 
	        System.out.println("SET IS EMPTY:" + h.isEmpty()); 
	        h.remove("Bhargav"); 
	        System.out.println("LIST AFTER REMOVING Bhargav:"
	                           + h); 
	        System.out.println("ELEMENT ACCORDING TO GIVEN INDEX IS: " + h.get(0));
	        System.out.println("SIZE OF THE SET IS: " + h.size()); 
	  
	        System.out.println("ITERATION:"); 
	        Iterator<String> i = h.iterator(); 
	        while (i.hasNext()) 
	            System.out.println(i.next());
	        
	}

}
