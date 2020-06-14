package hashing;

import java.util.HashSet;

public class UnionOfTwoArray {
	
	
	public static void main(String[] args) {
		
	int arr1[] = {7, 1, 5, 2, 3, 6}; 
    int arr2[] = {3, 8, 6, 20, 7}; 
    
    HashSet<Integer> m = new HashSet <Integer>();
    for(int i=0;i<arr1.length;i++)
    {
    	m.add(arr1[i]);
    }
    
    for(int j=0;j<arr2.length;j++)
    {
    	if(!m.contains(arr2[j]))
    		m.add(arr2[j]);
    }
    
    System.out.println(m);
    
    
	}

}
