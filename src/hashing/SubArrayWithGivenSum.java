package hashing;

import java.util.HashMap;
import java.util.Map;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {10, 2, -2, -20, 10};
		int[] arr = {5,8,6,13,3,-1};
		
		
        int n = arr.length; 
        //int sum = -10; 
        int sum = 22; 
        
        subArraySum(arr, n, sum); 
	}

	
	public static void subArraySum(int arr[],int n,int sum)
	{
		
		int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i]; 
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                break; 
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            if (hashMap.containsKey(cur_sum - sum)) { 
                start = hashMap.get(cur_sum - sum) + 1; 
                end = i; 
                break; 
            } 
            //if value is not present then add to hashmap 
            if(hashMap.containsKey(cur_sum) == false)
            {
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
            }
  
        } 
        // if end is -1 : means we have reached end without the sum 
        if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
        } else { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
        } 
	}
}
