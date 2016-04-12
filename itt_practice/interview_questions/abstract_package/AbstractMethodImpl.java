package tutorialspoint.questions.abstract_package;

public class AbstractMethodImpl extends AbstractMethod {

	private String restaurantName;
	
	public String printRestaurant() {
		findRestaurant();
		return restaurantName;
		
	}
	
	public void findRestaurant() {
		
	}
}
