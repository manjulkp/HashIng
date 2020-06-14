package hashing;

import java.util.HashSet;

public class FindLongestConseqSubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int n = arr.length;
		int count = sequenceCount(arr, n);
		System.out.println(count);

	}

	public static int sequenceCount(int[] arr, int n) {
		HashSet<Integer> S = new HashSet<Integer>();
		int ans = -1;

		// Hash all the array elements
		for (int i = 0; i < n; i++)
			S.add(arr[i]);

		for (int i = 0; i < n; ++i) 
		{
//this is to determine whether a[i] is starting point 
			if (!S.contains(arr[i] - 1)) 
			{
				
				int j = 1;
				while (S.contains(arr[i] +j ))
				{
					j++;
				}

				ans = Math.max(ans, j);

			}
		}
		return ans;
	}

}
