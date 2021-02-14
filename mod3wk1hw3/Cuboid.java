package mod3wk1hw3;

public class Cuboid extends Rectangle {

	private double height;

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		if(this.height < 0) {
			this.height = 0;
		}
	}
	
	public double getVolume() {
		return getWidth() * getLength() * height;	
	}
	
}
