package lesson19_oop_tasks_1;

public abstract class Quadrilateral {
	
	Point pA;
	Point pB;
	Point pC;
	Point pD;
	
	public abstract boolean checkIfExists();

	// duplicatePoints(Point A, Point B)
	// compareSides(int aLenght, int bLength)
	// compareDiagonals(int d1Length, int d2Lenght)
	
	// calculateSquareArea()
	// calculateParameter()
	
	public boolean hasDuplicatePoints(Point pA, Point pB, Point pC, Point pD){
		Point[] points = new Point[4];
		
		points[0] = pA;
		points[1] = pB;
		points[2] = pC;
		points[3] = pD;
		
		boolean flag = false;
		
		OUTER_LOOP: for (int i = 0; i <= points.length / 2; i++) {
			flag = points[i].isDuplicate(points[points.length - i - 1]);
			if(flag){
				break OUTER_LOOP;
			}
		}
		return flag;
	}
}
