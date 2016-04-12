package lesson23_exceptions;

public class Person {

	private String name;
	
	public Person(){
		
	}
	
	public Person(String name){
		this.name =  name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean hasTheSameName(Person p){
		return name.equals(p.name);
	}
}
