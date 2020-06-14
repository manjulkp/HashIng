package hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingElementsArraybyFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare and Initialize an array 
        int[] array = { 4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 }; 
        
        Map<Integer,Integer> h = new HashMap<Integer,Integer>();
        List<Integer> l = new ArrayList<>();  
        
    
        for(int i=0;i<array.length;i++)
        {
        	Integer c = h.get(array[i]);
        	if(h.get(array[i])== null)
        		h.put(array[i], 1);
        	else
        		h.put(array[i], ++c);
        	l.add(array[i]);
        }
        
//        SortComparator sort = new SortComparator(h); 
//        
//        Collections.sort(l,sort);
//        
//        for (Integer i : l) { 
//            System.out.print(i + " "); 
//        } 
        
        h.entrySet()
        .stream()
        .sorted(Map.Entry.<Integer,Integer>comparingByKey())
        .forEach(e->{
        	int key = e.getKey(); 
            int val = e.getValue(); 
            for (int i = 0; i < val; i++) { 
            	System.out.println(key );
            } 
        	
        });
        
        
	}
	
	
	
	

}

class SortComparator implements Comparator<Integer> { 
    private final Map<Integer, Integer> freqMap; 
  
    // Assign the specified map 
    SortComparator(Map<Integer, Integer> tFreqMap) 
    { 
        this.freqMap = tFreqMap; 
    } 
  
    // Compare the values 
    @Override
    public int compare(Integer k1, Integer k2) 
    { 
  
        // Compare value by frequency 
        int freqCompare = freqMap.get(k2).compareTo(freqMap.get(k1)); 
  
        // Compare value if frequency is equal 
        int valueCompare = k1.compareTo(k2); 
  
        // If frequency is equal, then just compare by value, otherwise - 
        // compare by the frequency. 
        if (freqCompare == 0) 
            return valueCompare; 
        else
            return freqCompare; 
    } 
} 

