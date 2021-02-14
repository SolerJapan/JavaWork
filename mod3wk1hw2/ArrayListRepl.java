package mod3wk1hw2;

import java.util.ArrayList;

public class ArrayListRepl {

public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean");
	
		list.set(1, "Algorithm");
		
		for (String i : list) {
			System.out.println(i);
		}
	}
}
