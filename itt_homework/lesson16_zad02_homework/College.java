package lesson16_zad02_homework;

/**
 * 
 * @author stanislav5
 * Demo class testing student functionality
 *
 */
public class College {

	public static void main(String[] args) {
		
		Student ivan = new Student("Ivan Petrov", 4.0,  "IOS", 3, 24, false, 0);
		Student george = new Student("George Georgov", 5.0, "JEE", 4, 25, true, 5);
		Student peter = new Student("Peter Ivanov Petrov", 3.50, "CS", 3, 24, false, 0);
		Student toncho = new Student("Toncho Georgov", 6.0, "Law", 4, 25, true, 5);
		Student penka = new Student("Penka Petrova", 5.0,  "Law", 3, 24, false, 0);

		george.receiveScholarship(4.50, 500);
		
		Student ioana = new Student("Ioana Ivanova", 3.0,  "Law", 4, 25, false, 5);
		Student grigorii = new Student("Grigorii Tyrnovski", 5.0, "Law", 3, 23, false, 5);
		
		StudentGroup stuGroup = new StudentGroup();
		StudentGroup stuGroup2 = new StudentGroup();
		
		stuGroup.groupSubject = "Law"; 

		stuGroup.addStudent(ivan);
		stuGroup.addStudent(george);
		stuGroup.addStudent(peter);
		stuGroup.addStudent(toncho);
		stuGroup.addStudent(penka);
		
		
		stuGroup2.addStudent(ioana);
		stuGroup2.addStudent(grigorii);
		
		System.out.println(stuGroup.theBestStudent().name);
	}
}
