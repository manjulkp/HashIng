package hashing;

import java.util.HashMap;

public class HaskMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		
		int count =0;
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			Integer c = h.get(arr[i]);
			
			if(h.get(arr[i]) == null)
			{
				h.put(arr[i], 1);
			}
			else
			{
				h.put(arr[i], ++c);
				
			}
		}
		
		System.out.println(h);
		
		
		

	}

}
