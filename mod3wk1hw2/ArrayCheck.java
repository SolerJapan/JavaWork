
package mod3wk1hw2;

import java.util.ArrayList;
import java.util.Collections;

//check if empty
public class ArrayCheck {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean");
	
	    if(list.isEmpty()) {
	    	System.out.println("list is  empty");
	    }
	    else {
	    	System.out.println("list is not empty");
	    }
	    if(list2.isEmpty()) {
	    	System.out.println("list2 is empty");
	    }
	    else {
	    	System.out.println("list2 is not  empty");
	    }
	}
}

