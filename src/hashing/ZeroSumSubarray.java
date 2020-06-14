package hashing;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 4, 13, -3, -10,5}; 
		
		int sum =0;
		
		Map<Integer,Integer> h = new HashMap<Integer, Integer>();
		//store the sum in an array ,if the there is repaeted sum ,then we have sum 
		for(int i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
			
			if(sum ==0)
			{
				System.out.println("found");
				break;
			}
			if(h.containsKey(sum))
			{
				System.out.println(i);
				System.out.println("found");
				System.out.println(h.get(sum));
				break;
			}
			
			h.put(sum, i); 
			
		}
		

	}

}
