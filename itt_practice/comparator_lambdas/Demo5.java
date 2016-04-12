package comparator_lambdas;

import java.util.Arrays;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

		list.forEach(x -> System.out.println(x*x));
		
		int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
		System.out.println(sum);

	}

}
