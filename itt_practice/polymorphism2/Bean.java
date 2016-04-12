package polymorphism2;

public class Bean extends Food implements IFood {

	@Override
	public Food cook(IFood f) {
		return (Food) f;
	}

	
}
