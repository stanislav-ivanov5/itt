package lesson20_zadachi_school;

public class Demo {


	public static void main(String[] args) {
		
		School school = new School("Svoboda");
		
		Teacher dimitar = new Teacher("Dimitar",  "Georgiev");
		Teacher hristina = new Teacher("Hristina", "Nikolova");
		
		Student s1 = new Student("Ivan", "Petrov");
		
		Group english = new Group("English");
		Group math = new Group("Math");
		Group german = new Group("German");
		
		english.addStudent(s1);
		math.addStudent(s1);
		german.addStudent(s1);
		
		school.addGroup(english, dimitar);
		school.addGroup(math, hristina);
		school.addGroup(german, dimitar);
		
//		school.addTeacher(hristina);
//		school.addTeacher(dimitar);
		
		dimitar.printTeacherInfo();
	}
}
