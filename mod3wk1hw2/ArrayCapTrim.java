package mod3wk1hw2;

import java.util.ArrayList;

public class ArrayCapTrim {
public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>(8);
		
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean"); 
	   
		
		
		System.out.println(list.size());
		
		list.trimToSize(); 
		
		System.out.println(list.size());
	}
}