package static_practice;

public class Demo {

	public static void main(String[] args) {
		
		God newGod = new God();
		
		newGod.godSays();
		
		Christian newChris = new Christian();
		newChris.jesus = newGod;

		newChris.pray();
	}
}
