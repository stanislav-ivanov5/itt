package polymorphism;

public class Lemur extends Primate implements HasTail {

	@Override
	public boolean isTailStripped() {
		return false;
	}

	public int age = 10;
	
	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStripped());
		
		Primate primate = lemur;
		System.out.println(primate.hasHair());
	}
}
