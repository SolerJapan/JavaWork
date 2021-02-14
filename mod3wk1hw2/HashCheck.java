package mod3wk1hw2;

import java.util.HashMap;

// check if empty
public class HashCheck {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();   
		map.put("A", 10); 
		map.put("B", 15); 
		map.put("C", 20); 
		map.put("D", 25); 
		map.put("E", 30); 
        
        if(map.isEmpty()) {
	    	System.out.println("map is  empty");
	    }
	    else {
	    	System.out.println("map is not empty");
	    }
	    if(map2.isEmpty()) {
	    	System.out.println("map is empty");
	    }
	    else {
	    	System.out.println("map is not  empty");
	    }
	}
}