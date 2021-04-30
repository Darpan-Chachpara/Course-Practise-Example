package lectutre;

import java.util.*;

public class Collections
{
	public static void main(String[] args) 
	{
		//ARRAYLIST EXAMPLE ...output as inserted and repeated elements are also displayed
		List a=new ArrayList();
		a.add("DOG");
		a.add("CAT");
		a.add("CAT");
		a.add("RAT");
		a.add(null);
		
		System.out.println("ARRAYLIST EXAMPLE:-");
		System.out.println(a);//output in single line
		System.out.println("\n");
		
		/*Iterator b=a.iterator();
		while(b.hasNext());
		{
			System.out.println(b.next());
		} output in different line*/    
		
		//VECTOR EXAMPLE  ...output as inserted and repeated elements are also displayed
		List c=new Vector();
		c.add("DOG");
		c.add("CAT");
		c.add("CAT");
		c.add("RAT");
		c.add(null);
				
		System.out.println("VECTOR EXAMPLE:-");
		System.out.println(c);//output in single line
		System.out.println("\n");		
		
		/*Iterator d=c.iterator();
		while(d.hasNext());
		{
			System.out.println(d.next());
		}output in different line*/	
		
		
		//LINKEDLIST EXAMPLE  according to requirements
		LinkedList e=new LinkedList();
		e.add("HELLO");
		e.add("WELCOME");
		//e.pop();  will delete HELLO 
		System.out.println("LINKEDLIST EXAMPLE:-");
		System.out.println(e);
		
		e.addFirst("HI");
		e.addLast("NICE");
		System.out.println(e);
		
		e.removeFirst();
		e.removeLast();
		System.out.println(e);
		System.out.println("\n");
		
		//Arraylist and vector are used for searching the elements
		//linkedList are used to add and remove the elements
		
		//HASHSET EXAMPLE   ...output as randomly and repeated elements are not displayed
		Set f=new HashSet();
		f.add("DOG");
		f.add("DOG");
		f.add("CAT");
		f.add("CAT");
		f.add("RAT");
		f.add(null);
		System.out.println("HASHSET EXAMPLE:-");
		System.out.println(f);
		System.out.println("\n");
		
		//TREESET EXAMPLE   ...output as randomly and repeated elements are not displayed
		Set g=new TreeSet();
		g.add("DOG");
		g.add("DOG");
		g.add("CAT");
		g.add("CAT");
		g.add("ZEBRA");
		g.add("RAT");  //null value is not used
		System.out.println("TREESET EXAMPLE:-");
		System.out.println(g);
		System.out.println("\n");
		
		
		//SIZE=0 ;CAPACITY=10; by default is used
		Vector v=new Vector(10,5);  // value for size and capacity
		//ArrayList v=new ArrayList();
		System.out.println("VECTOR CAPACITY EXAMPLE:-");
		System.out.println("SIZE BEFORE "+v.size());
		System.out.println("CAPACITY BEFORE "+v.capacity());
		for(int i=0;i<11;i++)
			v.add(i);
		System.out.println("SIZE AFTER "+v.size());
		System.out.println("CAPACITY AFTER "+v.capacity());
		System.out.println("ELEMENTS ARE "+v);
		
		
	}

}
