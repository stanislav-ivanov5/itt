package polymorphism2;

public class SmallBean extends Food {

	@Override
	public Food cook(IFood f) {
		return (Food) f;
	}

}
