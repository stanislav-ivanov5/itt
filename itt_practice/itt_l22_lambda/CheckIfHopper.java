package lesson22_lambda;

public class CheckIfHopper implements ICheckTrait {

	@Override
	public boolean test(Animal a) {
		return a.canHop();
	}

}
