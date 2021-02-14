package mod3wk1hw2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSub {
	
	
public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		 
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean");
		
		List<String> sub = list.subList(1, 3);
		
		for (String i : sub) {
			System.out.println(i);
		}
		
	}
}
