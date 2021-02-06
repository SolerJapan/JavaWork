package modwk1hw1;

public class mod3wk1hw1{
	
	static boolean getUp (boolean squawking, int currentHour ) {
	    if(currentHour < 0 || currentHour > 23) {
	    	squawking = true;
	    	return squawking;
	    }
	    else {
	    	squawking = false;
	    	return squawking;
	    }
	  }
	
	public static void main(String[] args) {
		System.out.println(getUp(true, 22));
		System.out.println(getUp(true, 26));
		
		
	}
}