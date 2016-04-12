package itt_l16_constructors;

import java.awt.Color;

public class Car {

	private static final int MAX_GEAR = 7;
	private static final int MIN_GEAR = 0;
	private static final int DEFAULT_SPEED = 10;
	private static final int MIN_SPEED = 10;
	private static final double COEF_FOR_SPORT_CAR = 0.05;
	private static final double COEF_FOR_COLOR = 0.05;
	private static final String WHITE_COLOR = "white";
	private static final String BLACK_COLOR = "black";
	private static final double DEFAULT_COEF = 0.2;
	private static final String SEPARATOR = ", ";
	private static final byte DEFAULT_GEAR = 0;
	private static final int DEFAULT_CURRENT_SPEED = 15;
	private static final String DEFAULT_COLOR = "yellow like a submarine";
	private static final int DEFAULT_PRICE = 1;
	private static final int MIN_PRICE = 0;
	private static final int DEFAULT_PROD_YEAR = 2000;
	private static final int MAX_PROD_YEAR = 2017;
	private static final int INITIAL_PROD_YEAR = 1900;
	private static final String DEFAULT_MAKE = "";
	private static final String DEFAULT_MODEL = "";
	
	private String make;
	private String model;
	private int productionYear;
	private double price;
	private boolean isSportCar;
	private String color;
	private int currentSpeed;
	private byte gear;
	private Person owner;
	
	

	public Car(String model, boolean isSportCar, String color){
		setModel(model);
		setSportCar(isSportCar);
		setColor(color);
		
		setCurrentSpeed(DEFAULT_CURRENT_SPEED);
		setGear(DEFAULT_GEAR);
	}
	
	void changeOwner(Person newOwner){
		if(newOwner != null){
			this.setOwner(newOwner);
			newOwner.car = this;
		}
	}
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		if(getMake() != null){
			sb.append(getMake());
			sb.append(SEPARATOR);
		}
		if(getModel() != null){
			sb.append(getModel());
			sb.append(SEPARATOR);
		}
		if(getColor() != null){
			sb.append(getColor());
			sb.append(SEPARATOR);
		}
		return sb.toString();
	}
	
	boolean isMoreExpensive(Car car){
		this.setPrice(this.getPrice());
		car.setPrice(car.getPrice());
		return this.getPrice() > car.getPrice();
	}
	
	double calculatePriceForScrap(double metalPrice){
		double coef = DEFAULT_COEF;
		if(this.getColor().equalsIgnoreCase(BLACK_COLOR) || 
				this.getColor().equalsIgnoreCase(WHITE_COLOR)){
			coef += COEF_FOR_COLOR;
		}
		if(this.isSportCar){
			coef += COEF_FOR_SPORT_CAR;
		}
		double price = metalPrice * coef;
		return price;
	}
	
	public String getMake() {
		return this.make;
	}
	public void setMake(String make) {
		this.make = (make != null) ? make : DEFAULT_MAKE;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = (model != null) ? model : DEFAULT_MODEL;
	}
	public int getProductionYear() {
		return this.productionYear;
	}
	public void setProductionYear(int productionYear) {
		this.productionYear = (productionYear > INITIAL_PROD_YEAR && productionYear < MAX_PROD_YEAR) 
				? productionYear : DEFAULT_PROD_YEAR;
	}
	public double getPrice() {
		return this.price;
	}
	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : DEFAULT_PRICE;
	}
	public boolean isSportCar() {
		return this.isSportCar;
	}
	public void setSportCar(boolean isSportCar) {
		this.isSportCar = isSportCar;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = (color != null) ? color : DEFAULT_COLOR;
	}
	
	public Person getOwner() {
		setOwner(getOwner());
		return this.owner;
	}

	public void setOwner(Person owner) {
		this.owner = (owner != null) ? owner : new Person();;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed =  (currentSpeed > MIN_SPEED) ? currentSpeed : DEFAULT_SPEED;
	}

	public byte getGear() {
		return gear;
	}

	public void setGear(byte gear) {
		this.gear = (gear > MIN_GEAR && gear < MAX_GEAR) ? gear : DEFAULT_GEAR;
	}
}
