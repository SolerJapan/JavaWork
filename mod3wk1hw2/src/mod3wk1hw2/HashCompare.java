package mod3wk1hw2;

import java.util.*;


//compares 2 sets and retains same elements
public class HashCompare {
public static void main(String[] args) {
		
		HashSet<String> hash1 = new HashSet<String>(); 
		HashSet<String> hash2 = new HashSet<String>();
		HashSet<String> hashsect = new HashSet<String>(); 
		
		hash1.add("alex"); 
		hash1.add("ben"); 
		hash1.add("caesar"); 
		hash1.add("dillon"); 
		hash1.add("eunice"); 
		
		hash2.add("alex"); 
		hash2.add("johan"); 
		hash2.add("caesar"); 
		hash2.add("wilbert"); 
		hash2.add("eunice"); 
		 
		System.out.println("HashSet1 has: "+ hash1);
		System.out.println("HashSet2 has: "+ hash2);
		//converting to array
		
	     // Displaying Array elements
	     System.out.println("intersect elements: ");
	     for( String sect : hash1){
	    	 if (hash2.contains(sect)) {
	    		 hashsect.add(sect);
			}
	     }
	     for(String temp : hashsect){
		        System.out.println(temp);
		 }
	}
}
