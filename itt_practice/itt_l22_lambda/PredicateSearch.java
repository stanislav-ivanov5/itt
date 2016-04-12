package lesson22_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		
		print(animals, a -> a.canSwim());
	}
	
	private static void print(List<Animal> animals, Predicate<Animal> checker){
		for (Animal animal : animals) {
			if(checker.test(animal)){
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
}
