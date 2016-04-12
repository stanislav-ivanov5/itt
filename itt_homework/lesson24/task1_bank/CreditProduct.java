package lesson24.task1_bank;

public class CreditProduct extends BankProduct {

	private static final String DEFAULT_NAME = "credit";
	
	
	public CreditProduct(double interest, String name){
		super(interest);
		setName(name);
	}
	
	private void setName(String newName){
		this.name = (name != null) ? ( this.name = newName ) : DEFAULT_NAME ;	
	}
	
}
