package lesson20_zadachi_quadrilateral;

public class Trapez extends Convex {

	private int c, d;
	
	public Trapez(int a, int b, int h) {
		super(a, b, h);
	}

	@Override
	public void findPerimeter() {
		System.out.println(this.getA() + this.getB() + this.getC() + this.getD());
	}

	@Override
	public void findSquare() {
		// TODO Auto-generated method stub
		
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = (c >= Convex.MIN_LENGTH) ? c : Convex.MIN_LENGTH;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = (d >= Convex.MIN_LENGTH) ? d : Convex.MIN_LENGTH;
	}
}
