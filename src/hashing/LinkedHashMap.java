package hashing;

import java.util.HashSet;
import java.util.Iterator;

public class LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements
        
        System.out.println(h);
        
        if(h.contains("India"))
        {
        	System.out.println("found");
        }
        
        Iterator<String> i = h.iterator();
        while(i.hasNext())
        {
        	System.out.println(i.next());
        }
        
	}

}
