package itt_l16_static_nonstatic_context;

public class StaticUser {

	int age;
	
	void bing(){
		System.out.println("ping");
		String[] s = {"ming", "ding"};
		ring();
	}
	
	static void ring(){
		System.out.println("nord");
	}
	
	public static void main(String[] args) {
		ring();
		new StaticUser().age = 5;
		new StaticUser().bing();
		String[] arr = {"1", "3", "0"};
	}
}
