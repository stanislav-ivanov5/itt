package lesson20_zadachi_school;

public abstract class SchoolEntity {

	private static final String EMPTY_STRING = "";
	
	private String name;
	private int freePlacePosition;
	private Student[] students;
	
	public SchoolEntity (String name) { 
		this.students = new Student[50];
		setFreePlace(0);
		setName(name);
		
	}
	
	
	public SchoolEntity (String name, int studentsNum) { 
		this(name);
		if(studentsNum > 0){
			this.students = new Student[studentsNum];
			setFreePlace(0);
		}
		
	}
	
	public void addStudent(Student student){
		if(student != null){
			if(freePlacePosition >= 0 && freePlacePosition < students.length){
				
				students[freePlacePosition] = student;
				freePlacePosition++;
			}
		}
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if(name != null){
			this.name = name;
		}
		else {
			System.out.println("invalid name");
		}
	}

	void printStudents(){
		for(Student s : students){
			
			if(s != null){
				System.out.println(s.getFirstName() + " " + s.getLastName());
			}
		}
	}

	public int getFreePlace() {
		return freePlacePosition;
	}


	public void setFreePlace(int freePlaces) {
		if(freePlaces > 0 && freePlaces <= students.length){
			this.freePlacePosition = freePlaces;
		}
	}
	
	
	
}
