package comparator_lambdas;

public class Frame implements Comparable<Frame>{

	String usedFor;
	int size;
	int price;
	
	@Override
	public int compareTo(Frame fr) {
		return this.size - fr.size;
	}
	
	
}
