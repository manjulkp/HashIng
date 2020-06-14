package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubArrayWithGivenSum {

	public static void main (String[] args) 
    {
        int arr[] = { 8,3,1,5,-6,6,2,2 };
        int n = arr.length;
        int sum = 4;
        
        subArraySum(arr, n, sum);
        
    }
    

		
	public static void subArraySum(int arr[],int n,int sum)
	{
		
		int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        
        int res = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
        
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i];
            System.out.println(cur_sum);
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                res = Math.max(res, end-start+1); 
                //System.out.println(res);
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            if (hashMap.containsKey(cur_sum - sum)) {
            	
                start = hashMap.get(cur_sum - sum) ; 
                end = i; 
                res = Math.max(res, end-start); 
                //System.out.println(res);
            }
            if(hashMap.containsKey(cur_sum) == false)
            {
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
            }
  
        } 
        // if end is -1 : means we have reached end without the sum 
        System.out.println(res);
	}
}
