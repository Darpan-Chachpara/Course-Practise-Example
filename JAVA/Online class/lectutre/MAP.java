package lectutre;
import java.util.HashMap;
import java.util.*;

public class MAP 
{
	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("XYZ", 100);
		hm.put("ABC", 200);
		hm.put("MNO", 300);
		System.out.println("HASHMAP EXAMPLE");
		System.out.println("HASH MAP :"+hm);
		
		//using entrySet()
		System.out.println("KEY/VALUE MAPPINGS :"+hm.entrySet());
		
		//using keySet()
		System.out.println("KEYS :"+hm.keySet());

		//using values()
		System.out.println("VALUE :"+hm.values());
		System.out.println("\n");
		
		/*for(String i: hm.keySet())
		{
			System.out.println("KEY :"+hm.get(i));
		}*/
		
		Hashtable ht=new Hashtable();
		ht.put("TMO", new Double(258.258));
		ht.put("MOM", new Double(147.147));
		ht.put("DAD", new Double(369.369));
		System.out.println("HASHTABLE EXAMPLE");
		Set set=ht.keySet();
		Iterator i=set.iterator();
		while(i.hasNext())
		{
			String str=(String)i.next();
			System.out.println(str+":"+ht.get(str));
		}
		
		/*
		Deposit 1,000 into jerry's account
		double bal=((Double)ht.get("jerry")).doubleValue();
		ht.put("jerry",new Double(bat+1000));
		System.out.println("jerry's new ht:"+ht.get("jerry"));
	
		 */
	}
}
