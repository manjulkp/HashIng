package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PairPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 8, 9, -4, 1, -1, -8, -9 };  
	    int n = arr.length;  
	  
	    pairGroup(arr, n); 
	}

	public static void pairGroup(int arr[], int n) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0)
				map.put(arr[i], 1);
		}

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (map.containsKey(Math.abs(arr[i]))) {
					System.out.println(Math.abs(arr[i]) + "  " +arr[i]);
				}
			}
		}

	}

}
