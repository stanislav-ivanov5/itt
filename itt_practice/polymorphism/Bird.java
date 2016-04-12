package polymorphism;

public class Bird extends Animal {

//	@Override
	public int walk(int x){
		return 1;
	}

	@Override
	public void walk() {

		System.out.println("Bird striding ");
	}
	
	public void sing(){
		System.out.println("bird singing songs and balads");
	}
}
