package hashing;

import java.util.HashMap;

public class NonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 9, 4, 9, 6, 7, 4 }; 
        int n = arr.length;
        
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        
        for(int i=0;i<n;i++)
        {
        	if(m.get(arr[i]) == null)
        	{
        		m.put(arr[i], 1);
        	}
        	else
        	{
        		int count = m.get(arr[i]);
        		count++;
        		m.put(arr[i],count);
        	}
        }
        
        for (int i = 0; i < n; i++) 
        {
        	if(m.get(arr[i])==1)
        	{
        		System.out.println(arr[i]);
        	}
        }
        

	}

}
