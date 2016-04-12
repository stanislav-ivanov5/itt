package lesson21_inner_classes;

public class DataStructure {

	private final static int SIZE = 15;
	private int[] array = new int[SIZE];
	
	public DataStructure(){
		for (int i = 0; i < SIZE; i++) {
			array[i] = i;
		}
	}
	
	public void printEven(){
		DataStructureIterator iterator = this.new EvenIterator();
	
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " ");
		}
		System.out.println();
	}
	
	interface DataStructureIterator extends java.util.Iterator<Integer>{ }
	
	private class EvenIterator implements DataStructureIterator{

		private int nextIndex = 0;
		
		@Override
		public boolean hasNext() {
			return nextIndex <= ( SIZE - 1 ) ;
		}

		@Override
		public Integer next() {

			Integer retValue = Integer.valueOf(array[nextIndex]);
			nextIndex += 2;
			return retValue;
		}	
	}
	
	public static void main(String[] args) {
		
		DataStructure ds = new DataStructure();
		ds.printEven();
	}
}
