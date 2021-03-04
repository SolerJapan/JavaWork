package mod3wk1hw2;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySwap {

	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean");
		
		Collections.swap(list, 1, 2);
		
		
		for (String i : list) {
			System.out.println(i);
		}
		
	}
}
