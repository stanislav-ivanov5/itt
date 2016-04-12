package tutorialspoint.questions.singleton;



public class SingletonInstantiator {

	public SingletonInstantiator() {
		Singleton instance = Singleton.getInstance();

		Singleton anotherInstance = new Singleton();
		
		instance.toString();
		anotherInstance.toString();
	}
	
	public void createSing() {
		Singleton instance = Singleton.getInstance();
		instance.toString();
	}
	
	
}
