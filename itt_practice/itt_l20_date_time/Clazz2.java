package lesson20_date_time;

public class Clazz2 extends Clazz{

//	public Clazz2(){
//		super(4);
//	}
//	
	public Clazz2(int a){
		super();
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Runtime.getRuntime();
		Runtime.runFinalizersOnExit(true);
		
		Clazz2 xc = new Clazz2(5);
	}
}
