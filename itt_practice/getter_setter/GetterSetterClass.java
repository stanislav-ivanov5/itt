package getter_setter;

public class GetterSetterClass {

	private final String LAST_NAME;
//	= "Ivanov";
	private int age;
	private String name;
	
	public GetterSetterClass(){
		this.LAST_NAME = "Ivanov";
	}
	
	public void setAnotherAge(final GetterSetterClass person){
		this.age = person.getAge();
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		if(age >= 0 ){ 
			this.age = age;
		}
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		if(name != null){
			this.name = name;
		}
		else {
			this.name = "default name";
		}
	}
}
