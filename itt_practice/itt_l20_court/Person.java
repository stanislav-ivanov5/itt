package lesson20_court;

public abstract class Person {

	private String name;
	
	public Person(String name){
		if(name != null){
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
}
