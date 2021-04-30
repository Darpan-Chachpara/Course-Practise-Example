package lectutre.CoreJavaAssignment;

import java.util.*;
public class Assignment_13_6_SortDescending 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"Darpan");  
		  hm.put(102,"Meet");  
		  hm.put(101,"Bhargav");  
		  hm.put(103,"Darshan");  
		  System.out.println(hm);
		  
		  for(Map.Entry m:hm.entrySet())
		  {  
		   System.out.println(m.getKey()+" "+m.getValue());  
		   
		  }  
	}

}
