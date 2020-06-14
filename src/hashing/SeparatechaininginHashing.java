package hashing;

import java.util.ArrayList;

public class SeparatechaininginHashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {92 ,4 ,14, 24, 44 ,91};
		int n = a.length;
		ArrayList<ArrayList<Integer>> hashTable = null ;
		int hashSize = 10;
		separateChaining(a,n,hashTable,hashSize);
		
		
		

	}
	
	public static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize)
	{
	    int tmpIndx;
	        for(int i=0; i<n; i++) {
	            tmpIndx = arr[i]%hashSize;
	            System.out.println(tmpIndx);
	            hashTable.get(tmpIndx).add(arr[i]);
	        }
	}

}
