package test2_vinetki;

public abstract class Vehicle {

	private static final int DEFAULT_YEAR = 1950;
	private static final int MAX_PROD_YEAR = 2016;
	private static final int MIN_PROD_YEAR = 1950;

	private String model;
	private int yearProduction;
	private Driver driver;


	public Vehicle(String model, int yearProduction) {
		setModel(model);
		setYearProduction(yearProduction);

	}
	
	public abstract int zalepiVinetka();
	
	public void addDriver(Driver driver) {
		if (driver != null) {
			this.driver = driver;
		}
	}

	public String getModel(){
		return this.model;
	}
	
	private void setModel(String model) {
		this.model = (model != null) ? model : "model";
	}

	private void setYearProduction(int yearProduction) {
		this.yearProduction = (yearProduction >= MIN_PROD_YEAR && yearProduction <= MAX_PROD_YEAR) ? 
				yearProduction
				: DEFAULT_YEAR;
	}

	public int zalepiVinetka(Vinetka vinetka) {
		// TODO Auto-generated method stub
		return 0;
	}
}
