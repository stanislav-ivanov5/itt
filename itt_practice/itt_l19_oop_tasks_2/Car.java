package lesson19_oop_tasks_2;

public class Car {

	private static final String DEFAULT_BRAND_VALUE = "";
	private static final String DEFAULT_MODEL_VALUE = "";
	private static final int DEFAULT_PROD_YEAR = 2000;
	private static final int INITIAL_PROD_YEAR = 1960;
	
	private String brand;
	private String model;
	private int yearOfProd;
	Part[] parts;
	
	public Car(){
		parts = new Part[50];
		setBrand(DEFAULT_BRAND_VALUE);
		setModel(DEFAULT_MODEL_VALUE);
		setYearOfProd(INITIAL_PROD_YEAR);
	}
	
	public Car(String brand, String model, int yearOfProd){
		this();
		setBrand(brand);
		setModel(model);
		setYearOfProd(yearOfProd);
		
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = (brand != null) ? brand : DEFAULT_BRAND_VALUE;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = (model != null) ? model : DEFAULT_MODEL_VALUE;
	}
	public int getYearOfProd() {
		return yearOfProd;
	}
	public void setYearOfProd(int yearOfProd) {
		this.yearOfProd = (yearOfProd > INITIAL_PROD_YEAR) ? yearOfProd : DEFAULT_PROD_YEAR;
	}
	
}
