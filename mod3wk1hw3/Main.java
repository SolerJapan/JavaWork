package mod3wk1hw3;

public class Main {
	
	
	public static void main(String[] args) {
	
		
	
		Rectangle Rect = new Rectangle();
		Rect.setLength(5);
		Rect.setWidth(10);
		
		
		System.out.println("rectangle.width= " + Rect.getWidth());
		System.out.println("rectangle.length= " + Rect.getLength());
		System.out.println("rectangle.area= " + Rect.getArea());
		Cuboid cub = new Cuboid();
		cub.setHeight(5);
		cub.setLength(10);
		cub.setWidth(5);				
		
		System.out.println("cuboid.width= " + cub.getWidth());
		System.out.println("cuboid.length= " + cub.getLength());
		System.out.println("cuboid.area= " + cub.getArea());
		System.out.println("cuboid.height= " + cub.getHeight());
		System.out.println("cuboid.volume= " + cub.getVolume());
		
	}
}
