package mod3wk1hw2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//iterate through all elements
public class HashIterate {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>(); 
		  
		map.put("A", "alex"); 
		map.put("B", "ben"); 
		map.put("C", "caesar"); 
		map.put("D", "dillon"); 
		map.put("E", "eunice"); 
        
		for (Map.Entry<String,String> entry : map.entrySet()) 
		{  
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
	    } 
		//alternative
//		Set set = map.entrySet();
//		Iterator i = set.iterator();
//		// Display elements
//		while(i.hasNext()) {
//		   Map.Entry me = (Map.Entry)i.next();
//		   System.out.print(me.getKey() + ": ");
//		   System.out.println(me.getValue());
//		}
	}
}
