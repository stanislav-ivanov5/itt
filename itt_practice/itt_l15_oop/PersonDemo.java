package itt_l15_oop;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person joro = new Person();
		Person mitko = new Person();
		
		joro.setAge((short)18);
		mitko = joro;
		mitko.setAge((short)21);
		System.out.println(joro.getAge());
	}
}
