package hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoArraysAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 5, 2, 2 };

		if (areEqual(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	public static boolean areEqual(int arr1[], int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;

		// If lengths of arrays are not equal
		if (n != m)
			return false;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		
		for(int i =0;i<n;i++)
		{
			if (map.get(arr1[i]) == null) {
				map.put(arr1[i], 1);
			} else {
				count = map.get(arr1[i]);
				count++;
				map.put(arr1[i], count);
			}
		}
			System.out.println(map);
			
			for (int j = 0; j < n; j++) { 
				if(! map.containsKey(arr2[j]))
					return false;
				
				//If an element is present more than another array
				if (map.get(arr2[j]) == 0) 
	                return false; 
	  
	            count = map.get(arr2[j]); 
	            --count; 
	            map.put(arr2[j], count); 
			}
			
		
		return true;

	}

}
