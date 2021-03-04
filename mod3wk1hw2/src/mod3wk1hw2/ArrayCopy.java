package mod3wk1hw2;
import java.util.ArrayList;

public class ArrayCopy {

	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> copy = new ArrayList<String>();
		list.add("alhabet");
		list.add("blue");
		list.add("chevalier");
		list.add("dean");
		
		for (String i : list) {
			copy.add(i);
		}
		for (String i : copy) {
			System.out.println(i);
		}
		
	}
}
