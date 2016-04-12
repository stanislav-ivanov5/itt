package oracleTutorialsObjects;

public class CreateObjectDemo {

	public static void main(String[] args) {
		
		Point originOne = new Point(23, 94);
		Rectangle rectOne = new Rectangle(originOne, 100, 200);
		Rectangle rectTwo = new Rectangle(50, 100);
		
		System.out.println("Width RectOne: " + rectOne.width);
		System.out.println("Height RectOne: " + rectOne.height);
		System.out.println("x position of rect two: " + rectOne.origin.x);
		System.out.println("y position of rect two: " + rectOne.origin.y);
		System.out.println("Area RectOne: " + rectOne.getArea());
		
		rectTwo.origin = originOne;
		System.out.println("x position of rect two: " + rectTwo.origin.x);
		System.out.println("y position of rect two: " + rectTwo.origin.y);
		
		rectTwo.move(40, 72);
		System.out.println("x position of rect two: " + rectTwo.origin.x);
		System.out.println("y position of rect two: " + rectTwo.origin.y);
		
		System.out.println(rectOne.origin.x);
		
		System.out.println(originOne.x);
		System.out.println(rectTwo.origin.x);
		
	}
}
