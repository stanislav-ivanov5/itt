package itt_l16_god;

public class Christian {

	static God god;
	
	void addGod(){
		Christian.god = new God();
		god.piligrim = this;
	}
	
	void printInfo(){
		this.god.setName("Jesus");
		System.out.println(Christian.god.getName());
	}
	
	
	public static void main(String[] args) {
		Christian cf = new Christian();
		
		cf.addGod();
		
		God god = new God();
		god.convert();
		
		cf.printInfo();
	}
}
