package lesson25_threads_synchronized;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		ImmutableClass imm = new ImmutableClass("name", 5, 65);
		
		imm = imm.changeName("name5");
		
		System.out.println(imm);
	}
}
