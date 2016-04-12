package lesson20_zadachi_school;

import java.util.Arrays;

public class Teacher extends Person {

	private int freePlacePosition;
	private Group[] groups;

	
	protected Teacher(String firstName, String lastName) {
		super(firstName, lastName);
		this.freePlacePosition = 0;
		groups = new Group[1];
	}

	
	void addGroup(Group group){
		groups = Arrays.copyOf(groups, groups.length + 1);
		if(group != null){
			if(freePlacePosition >= 0 && freePlacePosition < groups.length){
				
				groups[freePlacePosition] = group;
				freePlacePosition++;
			}
		}
	}
	
	void printGroups(){
		for(Group gr : groups){
			if(gr != null ){
				System.out.print("Group: " + gr.getName() + "\nStudents: \n" );
				gr.printStudents();				
			}
		}
	}
	
	void printTeacherInfo(){
		System.out.println("Teacher: " + this.getFirstName() + " " + this.getLastName());
		printGroups();
		
	}
}
