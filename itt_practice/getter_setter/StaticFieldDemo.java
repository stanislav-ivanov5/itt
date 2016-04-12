package getter_setter;

public class StaticFieldDemo {

	private static int uniqueID = 1;
	private int itemID;
	private String name;
	
	public StaticFieldDemo(String name){
		
		this.name = name;
		this.itemID = uniqueID;
		uniqueID++;
	}
	
	public static void main(String[] args) {
		
		String name = "Ivanov";
		StaticFieldDemo sfd = new StaticFieldDemo(name);
		StaticFieldDemo sfd1 = new StaticFieldDemo(name);
		
		System.out.println(uniqueID);
	}
}
