package itt_lesson5_arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		
		double[] nums = new double[9];
		
		int min = Integer.MIN_VALUE;
		
		int[] a = {4, 3, 1};
		int[] b = {4, 3, 1};
		
		System.out.println(a + " " + b);
		
		Integer integ = new Integer(5);
		System.out.println(integ.BYTES);
		
		int[] c = new int[3];
		c = a;
		System.out.println(c);
		
		c[0] = 400;
		
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);			
		}
		
		//compare arrays
		if(a.length == b.length){
			for(int i = 0; i < a.length; i++){
				if(a[i] != b[i]){
					System.out.println("They are not equal");
					break;
				}
				if(i == a.length){
					System.out.println("they are equal");
				}
			}
		}
	}
}

