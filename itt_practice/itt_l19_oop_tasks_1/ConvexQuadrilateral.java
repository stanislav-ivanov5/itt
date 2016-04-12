package lesson19_oop_tasks_1;

public class ConvexQuadrilateral extends Quadrilateral{

	Point pA;
	Point pB;
	Point pC;
	Point pD;
	
	public ConvexQuadrilateral(){
		
	}
	
	@Override
	public boolean checkIfExists() {
		super.hasDuplicatePoints(pA, pB, pC, pD); 
		// TODO AC > AD && AC> AB
		// BD > AD && BD > BC
		return false;
	}

}
