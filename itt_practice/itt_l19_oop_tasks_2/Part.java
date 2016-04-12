package lesson19_oop_tasks_2;

public class Part {

	private static final String DEFAULT_PART_NAME = "";
	private static final int MAX_CODE_VALUE = 15;
	private static final double MIN_DEFAULT_PRICE = 0.0d;
	private static final int MIN_SELL_PRICE = 0;
	private static final double DEFAULT_BUY_PRICE = 0.0d;
	private static final int MIN_BUY_PRICE = 0;
	private static final int DEFAULT_CODE_VALUE = 1;
	private static final int MIN_CODE_VALUE = 0;
	private static final int NUMBER_OF_ELIGIBLE_CARS_FOR_PART = 5;
	
	private int code;
	private String nameOfPart;
	private Category category;
	private double buyPrice;
	private double sellPrice;
	private Car[] eligibleCars;
	private Manufacturer firm;
	private int partQuantity;
	
	
	public Part(){
		eligibleCars = new Car[NUMBER_OF_ELIGIBLE_CARS_FOR_PART];
		setBuyPrice(DEFAULT_BUY_PRICE);
		setCode(DEFAULT_CODE_VALUE);
		setNameOfPart(DEFAULT_PART_NAME);
	}
	
	public Part(int code, String nameOfPart, Category category, double buyPrice, 
			double sellPrice, Manufacturer firm){
		this();
		setCode(code);
		setNameOfPart(nameOfPart);
		setCategory(category);
		setBuyPrice(buyPrice);
		setSellPrice(sellPrice);
		setFirm(firm);
	}
	
	public Part(int code, String nameOfPart, Category category, double buyPrice, 
			double sellPrice, Manufacturer firm, int partQuantity){
		this(code, nameOfPart, category, buyPrice, sellPrice, firm);
		setPartQuantity(partQuantity);
	} 
	
	
	public void sellPart(){
		System.out.println("sell part: " + getCode() + " " + getNameOfPart());
		setPartQuantity(getPartQuantity() - 1);
		
	}
	
	public void buyPart(){
		System.out.println("buy part: " + getCode() + " " + getNameOfPart());
		setPartQuantity(getPartQuantity() + 1);
		this.eligibleCars[0].parts[0] = this;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = (code > MIN_CODE_VALUE && code < MAX_CODE_VALUE) 
				? code : DEFAULT_CODE_VALUE;
	}
	public String getNameOfPart() {
		return nameOfPart;
	}
	public void setNameOfPart(String nameOfPart) {
		this.nameOfPart = (nameOfPart != null) ? nameOfPart : DEFAULT_PART_NAME;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = (category != null) ? category : new Category();
	}
	public double getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(double buyPrice) {
		this.buyPrice = (buyPrice > MIN_BUY_PRICE) ? buyPrice : DEFAULT_BUY_PRICE;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = (sellPrice > MIN_SELL_PRICE) ? sellPrice : MIN_DEFAULT_PRICE;
	}
	public Manufacturer getFirm() {
		return firm;
	}
	public void setFirm(Manufacturer firm) {
		this.firm = (firm != null) ? firm : new Manufacturer();
	}

	public int getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(int partQuantity) {
		this.partQuantity = (partQuantity >= 0) ? partQuantity : 0;
	}
	
}
