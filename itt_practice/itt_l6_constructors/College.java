package itt_l6_constructors;

public class College {

	public static void main(String[] args) {
		
		Student ivan = new Student();
		Student gaba = new Student();
		Student trevi = new Student();
		
		ivan.setAge(19);
		ivan.setGrade(4.5);
		ivan.setHasDegree(false);
		ivan.setYearsInCollege(2);
		
		gaba.setAge(20);
		gaba.setHasDegree(false);
		gaba.setName("Gaba");
		gaba.setGrade(5.0);
		
		trevi.setAge(22);
		trevi.setName("Trev");
		trevi.setGrade(6.0);
		
		StudentGroup sg = new StudentGroup("Contract Law");
		sg.addStudent(trevi);
		sg.addStudent(gaba);
		System.out.println(sg.theBestStudent());
		sg.printStudentsInGroup();
		
		System.out.println(sg.getGroupSubject());
	}
}
