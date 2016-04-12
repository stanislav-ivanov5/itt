package lesson19_oop_tasks_2;

public class Category {

	private String nameOfCategory;
	
	public static final int POWERTRAIN = 1;
	public static final int TYRE_RIMS = 2;
	public static final int ENGING = 3;
	public static final int ACCESSORIES = 4;
	
	public String getNameOfCategory() {
		return nameOfCategory;
	}
	public void setNameOfCategory(String nameOfCategory) {
		if(nameOfCategory != null) {
			switch(Integer.parseInt(nameOfCategory)){
			case 1: 
				nameOfCategory = "Powertrain";
				break;
			case 2:
				nameOfCategory = "TYRE_RIMS";
				break;
			case 3:
				nameOfCategory = "Engine";
				break;
			case 4:
				nameOfCategory = "Accessories";
				break;
			default:
				System.out.println("No such category");
				break;
			}
		}
	}
}
