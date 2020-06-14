package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PairSumInArray {

	public static void main(String[] args) {

		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 16;
		printpairs(A, sum);

	}

	public static void printpairs(int[] arr, int sum) {
		
		HashSet <Integer> m = new HashSet();
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = sum-arr[i]; 
			  
            // checking for condition 
            if (m.contains(temp)) 
            { 
                System.out.println("Pair with given sum " + 
                                    sum + " is (" + arr[i] + 
                                    ", "+temp+")"); 
            } 
            m.add(arr[i]); 
		}
		
		

	}

}
