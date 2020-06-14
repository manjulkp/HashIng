package hashing;

import java.util.HashMap;

public class Countdistinctelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 9, 4, 9, 6, 7, 4 }; 
        int n = arr.length;
        
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        int size=0;
        
        for(int i=0;i<n;i++)
        {
        	if(m.get(arr[i]) == null)
        	{
        		m.put(arr[i], 1);
        		size++;
        	}
        	else
        	{
        		int count = m.get(arr[i]);
        		count++;
        		m.put(arr[i],count);
        	}
        }
        
        System.out.println(size);
        System.out.println(m.size());
        
        
        

	}

}
