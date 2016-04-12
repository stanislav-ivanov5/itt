package itt_l16_god;

public class God {

	private static final String DEFAULT_NAME = "";
	private String name;
	Christian piligrim;
	
	public God() {
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String newName){
		this.name = (newName != null) ? newName : DEFAULT_NAME ;
	}
	
	void prayToMe(){}
	void convert(){
		System.out.println("convert ");
	}
	
	
}
