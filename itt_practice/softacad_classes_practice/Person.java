package softacadClassesPractice;

public class Person {

	int age;
	float weight;
	String name;
	Person[] friends;
	long personalNumber;
	boolean isMale;
	
	Person(){
		this.age = 0;
		this.weight = 4.0f;
	}

	Person(int age){
		this();
		this.age = age;
	}
	
	Person(int age, String name){
		this(age);
		if(name != null){
			this.name = name;
		}
		else{
			this.name = "";
		}
	}
	
	Person(int age, String name, float weight){
		this(age, name);
		if(weight > 4.0f){
			this.weight = weight;
		}
		else{
			this.weight = 4.0f;
		}
	}
	
	Person(String name, long personalNumber, boolean isMale){
		this();
		
		friends = new Person[3];
		
		if(personalNumber > 1000000000){
			this.personalNumber = personalNumber;
		}
		else {
			this.personalNumber = 1000000000;
		}
		
		this.isMale = isMale;
	}
}
