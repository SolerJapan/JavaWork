package mod3wk1hw3;

public class Rectangle{
	
	private double width;
	private double length;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
		if(this.width < 0) {
			this.width = 0;
		}
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
		if(this.length < 0) {
			this.length = 0;
		}
		
	}

	public double getArea() {
		return width * length;	
	}
}	

