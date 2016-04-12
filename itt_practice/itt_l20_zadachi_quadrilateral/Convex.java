package lesson20_zadachi_quadrilateral;

public abstract class Convex implements Quadri {

	protected static final int TWO_TIMES = 2;
	protected static final int MIN_LENGTH = 0;
	private int a, b;
	private int h;
	
	public Convex(int a, int b, int h){
		setA(a);
		setB(b);
		setH(h);
	}

	@Override
	public void findPerimeter() {
		System.out.println((this.getA() + this.getB()) * TWO_TIMES );
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = (a >= MIN_LENGTH) ? a : MIN_LENGTH;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = (b >= MIN_LENGTH) ? b : MIN_LENGTH;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = (h >= MIN_LENGTH) ? h : MIN_LENGTH;
	}
	
	
}
