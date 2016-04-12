package lesson20_zadachi_school;

public abstract class Person {

	private String firstName;
	private String lastName;
	
	protected Person(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}


	String getFirstName(){
		return this.firstName;
	}
	
	String getLastName(){
		return this.lastName;
	}

	protected void setFirstName(String firstName) {
		if(firstName != null){
			this.firstName = firstName;
		}
	}
	
	protected void setLastName(String lastName) {
		if(lastName != null){
			this.lastName = lastName;
		}
	}
}
