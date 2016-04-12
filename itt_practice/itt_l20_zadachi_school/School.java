package lesson20_zadachi_school;

import java.util.ArrayList;
import java.util.List;

public class School extends SchoolEntity {

	private List<Teacher> teachers;
	private List<Group> groups;
	
	public School(String name){
		super(name);
		teachers = new ArrayList<>();
		groups = new ArrayList<>();
	}
	
	void addTeacher(Teacher t){
		if(t != null ){
			teachers.add(t);
			
		}

	}
	
	void addGroup(Group group, Teacher teacher){
		if(group != null){
			groups.add(group);
			
			if(teacher != null){
				
				if(!teachers.contains(teacher)){
					addTeacher(teacher);
					teacher.addGroup(group);
				}
			}
			
			
		}
	}

}
