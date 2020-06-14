package hashing;

import java.util.HashSet;

public class FirstRepeatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 5, 3, 4, 3, 5, 6}; 
        printFirstRepeating(arr); 

	}
	
	public static void printFirstRepeating(int[] arr)
	{
		int min = -1;
		
		HashSet s= new HashSet();
		
		for(int i=arr.length-1;i>0;i--)
		{
			if(s.contains(arr[i]))
			{
				min =i;
			
			}
			else
				s.add(arr[i]);
		}
		System.out.println(arr[min]);
		
	}

}
