package hashing;

import java.util.HashMap;
import java.util.Map;

public class ElectionWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] votes = { "john", "johnny", "jackie", 
                "johnny", "john", "jackie", 
                "jamie", "jamie", "john", 
                "johnny", "jamie", "johnny", 
                "john" }; 
		
		Map<String,Integer> map = new HashMap<String, Integer>();
		for(String s: votes)
		{
			if(!map.containsKey(s))
				map.put(s,1);
			else
				map.put(s,map.get(s)+1);
		}
		
		System.out.println(map);
		
		int maxValueInMap = 0; 
        String winner = ""; 
        
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
        	String key  = entry.getKey(); 
            Integer val = entry.getValue();
            
            if (val > maxValueInMap) 
            {
            	maxValueInMap = val;
            	winner = key;
            }
            else if (val == maxValueInMap && winner.compareTo(key) > 0)
            {
            	winner = key;
            }
        }
        
        System.out.println(winner); 

	}

}
