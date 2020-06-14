package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RelativeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A1[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 }; 
        int A2[] = { 2, 1, 8, 3 }; 
        int m = A1.length; 
        int n = A2.length;
        
        Map<Integer,Integer> h = new HashMap<Integer,Integer>();
        
        for(int i=0;i<A1.length;i++)
        {
        	
        	if(h.containsKey(A1[i]))
        	{
        		h.put(A1[i], h.get(A1[i])+1);
        	}
        	else
        	{
        		h.put(A1[i], 1);
        		
        	}
        	
        }
        
        for(int i=0;i<A2.length;i++)
        {
        	if(h.containsKey(A2[i]))
        	{
        		for(int j=0;j<h.get(A2[i]);j++)
        		{
        			System.out.println(A2[i]);
        		}
        		h.remove(A2[i]);
        	}
        }
        
        for(Entry<Integer, Integer> entry : h.entrySet())
        {
        	for(int i=0;i<entry.getValue();i++)
        	{
        		System.out.println(entry.getKey());
        	}
        }
	}

}
