package mod3wk1hw2;


import java.util.*;


public class HashsetToArray {
public static void main(String[] args) {
		
		HashSet<String> hash = new HashSet<String>(); 
		  
		hash.add("alex"); 
		hash.add("ben"); 
		hash.add("caesar"); 
		hash.add("dillon"); 
		hash.add("eunice"); 
		
		 
		System.out.println("HashSet has: "+ hash);
		
		//converting to array
		String[] arr = new String[hash.size()];
		hash.toArray(arr);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	     for(String temp : arr){
	        System.out.println(temp);
	     }
	}
}
