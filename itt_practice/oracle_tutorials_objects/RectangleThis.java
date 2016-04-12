package oracleTutorialsObjects;

public class RectangleThis {

	private int x, y;
	private int width, height;
	
	public RectangleThis(){
		this(0, 0, 1, 1);
	}
	
	public RectangleThis(int width, int height){
		this(0, 0, width, height);
	}
	
	public RectangleThis(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
}
