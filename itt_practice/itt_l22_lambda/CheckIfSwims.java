package lesson22_lambda;

public class CheckIfSwims implements ICheckTrait{

	@Override
	public boolean test(Animal a) {
		return a.canSwim();
	}

}
