package lectutre.CoreJavaAssignment;
import java.util.*;
public class Assignment_13_5_Product 
{
	public static void main(String[] args) 
	{
		 Hashtable<String ,String> ht=new Hashtable<String ,String>();  
		  
		  ht.put("P004","Darpan");  
		  ht.put("P007","Meet");  
		  ht.put("P001","Bhargav");  
		  ht.put("P008","Darshan");  
		  ht.put("P002","Dhaval");  
		  ht.put("P006","Hardik");  
		  ht.put("P003","Diyan");  
		  ht.put("P009","Payal");  
		  ht.put("P005","PayalB");  
		  ht.put("P000","Shradha");  
		  
		  
		  for(Map.Entry m:ht.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		    
		  }  
		  boolean search = ht.contains("Darpan");
	      System.out.println("Search Result: " +search);
	      ht.remove("P006", "Hardik");
	     System.out.println("After removing 5th element: " +ht);
	}

}
