package lesson22_lambda;

import java.util.ArrayList;
import java.util.List;

public class TraditionalSearch {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("kangaroo", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("turtle", false, true));
	
		
		print(animals, a -> a.canHop());
		print(animals, (Animal a) -> { return a.canHop(); });
		
		print(animals, a -> ! a.canSwim());
		
		print(animals, new CheckIfHopper());
		print(animals, new CheckIfSwims());
		
		
		List<String> list = new ArrayList<>();
		list.removeIf((String s) -> s.isEmpty());
	}
	
	private static void print(List<Animal> animals, ICheckTrait checker){
		for(Animal animal : animals){
			if(checker.test(animal)){
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
}
