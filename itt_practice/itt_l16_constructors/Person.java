package itt_l16_constructors;

public class Person {

	private static final String DEFAULT_COLOR = "";
	private static final String DEFAULT_CAR_NAME = "kola";
	private static final int MIN_MONEY = 0;
	private static final int DEFAULT_MONEY = 0;
	private static final long DEFAULT_PERSONAL_NUM_VALUE = 1000000000L;
	private static final long MIN_PERSONAL_NUM_VALUE = 1000000000L;
	private static final int MIN_AGE = 0;
	private static final int MAX_AGE = 105;
	private static final double DEFAULT_WEIGHT = 4.0;
	private static final double MAX_WEIGHT = 250;
	private static final double MIN_WEIGHT = 4.0;
	private static final int DEFAULT_HEIGHT = 50;
	private static final double MAX_HEIGHT = 250;
	private static final double MIN_HEIGHT = 50;
	private static final String DEFAULT_NAME = DEFAULT_COLOR;
	private static final int DEFAULT_AGE = 1;
	
	private String name;
	private int age;
	private double height;
	private double weight;
	private Friend[] friends;
	private long personalNumber;
	private boolean isMale;
	private double money;
	Car car;
	final int EGN = 6;
	

	public Person(){
		setAge(MIN_AGE);
		setWeight(MIN_WEIGHT);
	}
	
	public Person(int age){
		this();
		setAge(age);
	}
	
	public Person(int age, String name){
		this(age);
		setName(name);
	}
	
	public Person(int age, String name, double height){
		this(age, name);
		setHeight(height);
	}
	
	public Person(String name, long personalNumber, boolean isMale){
		this();
		setName(name);
		setPersonalNumber(personalNumber);
		this.isMale = isMale;
		
		this.friends = new Friend[3];
	}
	
	void buyCar(Car car){
		if(car != null){
			if(this.getMoney() > car.getPrice()){
				System.out.println("buy car");
				car.changeOwner(this);
			}
			
		}
	}
	
	double sellCarForScrap(){
		double newMoneyAmount = this.getMoney();
		if(this.car != null) {
			newMoneyAmount +=  this.car.calculatePriceForScrap(5);
			this.setMoney(newMoneyAmount);
		}
		return newMoneyAmount;
	}
	
	@Override
	public String toString(){
		if(getName() != null){
			return getName();
		}
		if(getAge() != 0 ){
			return ((Integer)getAge()).toString();
		}
		return DEFAULT_NAME;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = (name != null) ? name : DEFAULT_NAME;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = (age >= MIN_AGE && age < MAX_AGE) ? age : DEFAULT_AGE;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = (height > MIN_HEIGHT && height < MAX_HEIGHT) ? height : DEFAULT_HEIGHT;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = (weight > MIN_WEIGHT && weight < MAX_WEIGHT) ? weight : DEFAULT_WEIGHT;
	}

	public long getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(long personalNumber) {
		this.personalNumber = (personalNumber > MIN_PERSONAL_NUM_VALUE ) ? personalNumber : DEFAULT_PERSONAL_NUM_VALUE ;
	}

	public boolean isMale() {
		return isMale;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = (money > MIN_MONEY) ? money : DEFAULT_MONEY;
	}

	public Car getCar() {
		setCar(getCar());
		return this.car;
	}

	public void setCar(Car car) {
		this.car = (car != null) ? car : new Car(DEFAULT_CAR_NAME, false, DEFAULT_COLOR);
	}
	
//	public void setMale(boolean isMale) {
//		this.isMale = isMale;
//	}
	
	
}
