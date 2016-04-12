package lesson25_threads_synchronized;

public class ImmutableClass {

	private static final String DEFAULT_NAME = "";

	final String name;
	final int weight;
	final int height;

	public ImmutableClass(String name, int weight, int height) {
		this.name = (name != null) ? name : DEFAULT_NAME;

		this.weight = (weight >= 0) ? weight : 4;
		this.height = (height >= 0) ? height : 50;
	}

	public ImmutableClass changeName(String name){
		return new ImmutableClass(name, weight, height);
	}

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	
	
}
