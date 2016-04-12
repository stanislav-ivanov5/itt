package lesson17_inheritance;

/**
 * 
 * @author stanislav5
 *	Demo class testing person, employee and student functionality
 *	
 */
public class Demo {

	public static void main(String[] args) {
		
		Person peter = new Person("Peter", 25, true);
//		peter.showPersonInfo();
		Person ivanka = new Person("Ivanka", 17, false);
		
		Student george = new Student("George", 17, true, 5.41f);
//		george.showStudentInfo();
		Student dimitar = new Student("Mitko", 17, true, 4.41f);
		
		Employee tervel = new Employee("Tervel", 30, true, 15);
		tervel.calculateOvertime(3);
//		tervel.showEmployeeInfo();
		Employee rada = new Employee("Rada", 30, false, 12);
		
		Person[] persons = new Person[10];
		
		persons[0] = peter;
		persons[1] = ivanka;
		persons[2] = george;
		persons[3] = dimitar;
		persons[4] = tervel;
		persons[5] = rada;
		
		
		/*
		 *  invoke  showPersonInfo, showStudentInfo, showEmployeeInfo
		 *  in accordance to the type of the object which invokes it 
		 *  from the array persons[]
		 */
		for (int index = 0; index < persons.length; index++) {
			if(persons[index] != null){
				if(persons[index] instanceof Person){
					persons[index].showPersonInfo();
					continue;
				}
				if(persons[index] instanceof Student){
					((Student) persons[index]).showStudentInfo();
					continue;
				}
				if(persons[index] instanceof Employee){
					((Employee) persons[index]).showEmployeeInfo();
					continue;
				}
			}
		}
		
		System.out.println("\n *************");
		// prints the overtime wage where each Person is an Emplyee
		for (int index = 0; index < persons.length; index++) {
			if(persons[index] != null){
				if(persons[index] instanceof Employee){
					System.out.println(  ((Employee) persons[index]).toString() +
							" " + ((Employee) persons[index]).calculateOvertime(2));
				}
			}
		}
	}
}
