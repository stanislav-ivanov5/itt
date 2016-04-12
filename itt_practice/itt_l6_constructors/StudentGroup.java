package itt_l6_constructors;

public class StudentGroup {

	
	private static final String DEFAULT_NAME = "";
	private static final int DEFAULT_STUDENTS_IN_GROUP = 5;
	private static final int MIN_FREE_SPACES = 0;
	private static final int DEFAULT_FREE_SPACES = 0;
	private static final String DEFAULT_SUBJECT = "subject";
	
	private String groupSubject;
	private Student[] students;
	private int freePlaces;
	
	public StudentGroup(){
		students = new Student[DEFAULT_STUDENTS_IN_GROUP];
		setFreePlaces(DEFAULT_STUDENTS_IN_GROUP);
	}
	
	public StudentGroup(String subject){
		this();
		setGroupSubject(subject);

		
	}
	
	void addStudent(Student s){
		if(this.getFreePlaces() <= DEFAULT_STUDENTS_IN_GROUP && this.getFreePlaces() >= MIN_FREE_SPACES ){
			students[DEFAULT_STUDENTS_IN_GROUP - getFreePlaces()] = s;
			setFreePlaces(getFreePlaces() - 1);
		}
	}
	
	void emptyGroup(){
		students = new Student[DEFAULT_STUDENTS_IN_GROUP];
		setFreePlaces(DEFAULT_STUDENTS_IN_GROUP);
	}
	
	String theBestStudent(){
		double maxGrade = 0;
		String name = DEFAULT_NAME;

		
		for(int index = 0; index < students.length; index++){
			if(students[index] != null){
				if(maxGrade < students[index].getGrade()){
					maxGrade = students[index].getGrade();
					name = students[index].getName();
				}
			}
		}
		if(!name.equalsIgnoreCase(DEFAULT_NAME)){
			System.out.print("Best student ");
		}
		return name;
	}
	
	void printStudentsInGroup(){
			for (int i = 0; i < students.length; i++) {
				if(students[i] != null){
//					System.out.println(5);
					System.out.println(students[i].getName() + ": " + 
							students[i].getAge() + ": " + students[i].getGrade());
				}
			}
			System.out.println("***");
	}
	
	// get and set methods
	public String getGroupSubject() {
		return groupSubject;
	}
	public void setGroupSubject(String groupSubject) {
		this.groupSubject = (groupSubject != null) ? groupSubject : DEFAULT_SUBJECT;
	}
	public int getFreePlaces() {
		return freePlaces;
	}
	private void setFreePlaces(int freePlaces) {
		this.freePlaces = (freePlaces >= MIN_FREE_SPACES) ? freePlaces : DEFAULT_FREE_SPACES;
	}
	
	
}

