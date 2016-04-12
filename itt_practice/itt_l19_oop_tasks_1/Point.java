package lesson19_oop_tasks_1;

public class Point {

	private int x;
	private int y;
	
	public Point(){
		setX(1);
		setY(1);
	}
	
	public Point(int x, int y){
		setX(x);
		setY(y);
	}
	
	public int getX(){ return this.x; }
	
	public void setX(int x){
		this.x = (x >= 0) ? x : 0;
	}
	
	public int getY(){ return this.y; }
	
	public void setY(int y){
		this.y = (y >= 0) ? y : 0;
	}
	
	public boolean isDuplicate(Point p2){
		return (this.x  == p2.x && this.y == p2.y) ? true : false;
	}
	
	// compare()
	
}
