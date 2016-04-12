package getter_setter;

// just a random class A
public class ClassA {

	private static int x = 0;
	private int y = 4;
	
	public ClassA(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void justMethod(){
		y = 5;
		
	}
	
	public static void main(String[] args){
		ClassA a1 = new ClassA(2, 3);
		ClassA a2 = new ClassA(7, 9);
		
		System.out.println(a1.x);
		System.out.println(a2.y);
		
		a2.y++;
		a1.x += a2.y;
		System.out.println(a1.x);
		a2.y = a1.y - 1;
		System.out.println(a2.y);
	}
}
