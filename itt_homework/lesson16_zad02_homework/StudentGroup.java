package lesson16_zad02_homework;

public class StudentGroup {

	final int STUDENT_NUM = 5;
	
	String groupSubject;
	Student[] students;
	int freePlaces;
	
	public StudentGroup(){
		students = new Student[STUDENT_NUM];
		freePlaces = STUDENT_NUM;
		this.groupSubject = "";
	}
	
	public StudentGroup(String subject){
		this();
		if(subject != null){
			this.groupSubject = subject;
		}
		else {
			this.groupSubject = "subject";
		}
	}
	
	void addStudent(Student s){
		if(s != null && s.subject != null){
			if(s.subject.equals(this.groupSubject)){
				students[students.length - freePlaces] = s;
				--freePlaces;
			}
		}
	}
	
	void emptyGroup(){
		this.students = new Student[STUDENT_NUM];
		freePlaces = 5;
	}
	
	Student theBestStudent(){
		double maxGrade = 0;
		int index = 0;
		
		for (int i = 0; i < this.students.length; i++) {
		
			if(this.students[i] != null){
				if(this.students[i].grade > maxGrade){
					maxGrade = this.students[i].grade;
					index = i;
				}				
			}
		}
		return this.students[index];
	}
	
	void printStudentsInGroup(){
		for (int i = 0; i < this.students.length; i++) {
			System.out.println("Name: " + this.students[i].name + 
					"Age: " + this.students[i].age + 
					", Subject: " + this.students[i].subject + 
					",  Grade: " + this.students[i].grade +  
					",  Year in college: " + this.students[i].yearInCollege +
					",  Money: " + this.students[i].money);
		}
	}
	
}
