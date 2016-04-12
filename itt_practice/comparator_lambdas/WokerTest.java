package comparator_lambdas;

public class WokerTest {

	public static void execute(IWorker worker){
		worker.doSmth();
	}
	
	public static void main(String[] args) {
		
		execute(new IWorker(){

			@Override
			public void doSmth() {
				System.out.println("anonymous");
			}
			
		});
		
		execute(() -> System.out.println("lambda "));
	}
}
