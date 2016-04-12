package lesson20_zadachi_quadrilateral;

public class Rhombus extends Parallelo {

	public Rhombus(int a, int h) {
		super(a, a, h);
	}

	@Override
	public void findPerimeter() {
		System.out.println((this.getA() + this.getA()) * Convex.TWO_TIMES );
	}
}
