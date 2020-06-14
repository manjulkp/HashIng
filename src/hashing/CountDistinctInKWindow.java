package hashing;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctInKWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1, 2, 1, 3, 4, 2, 3}; 
        int k = 4; 
        getDistinctWindow(arr, k); 
        
	}
	
	public static void getDistinctWindow(int arr[],int k)
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int count =0;
		
		for(int i=0;i<k;i++)
		{
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				count++;
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(count);
		
		for (int i = k; i < arr.length; i++) 
        {
			//remove the first element i-k
			if(map.get(arr[i-k]) == 1)
			{
				map.remove(arr[i-k]);
				count--;
			}
			else
			{
				map.put(arr[i-k],map.get(arr[i-k])-1);
			}
			
			//new element to be added to window
			if(map.containsKey(arr[i]))
			{
				map.put(arr[i], map.get(arr[i])+1);
			}
			else
			{
				count++;
				map.put(arr[i], 1);
			}
			
			System.out.println(count);
			
        }
	}

}
