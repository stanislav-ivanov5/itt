package tutorialspoint.questions.object_package;

public class ClassForObjectsHomeworking {
	
	private String name;
	private static int age;
	
	public ClassForObjectsHomeworking(String name, int age) {
		this.name = name;
		ClassForObjectsHomeworking.age = age;
	}
	
	public static void main(String[] args) {
		ClassForObjectsHomeworking cfoh = new ClassForObjectsHomeworking("peshko", 24);
		
		System.out.println(cfoh.name);
		System.out.println(ClassForObjectsHomeworking.age);

	}
}
