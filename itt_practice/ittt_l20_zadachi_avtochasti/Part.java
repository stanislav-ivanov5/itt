package lesson20_zadachi_avtochasti;

import java.util.Arrays;

public abstract class Part extends AutoPartsStore {

	private static final int MAX_CODE = 4;
	private static final int MIN_CODE = 1;
	
	private int code;
	private String name;
	private int buyPrice;
	private int sellPrice;
	private Car[] cars;
//	private Category cat;

	
	public Part(int code, String name, int buyPrice, int sellPrice){
		setCode(code);
		setName(name);
		setBuyPrice(buyPrice);
		setSellPrice(sellPrice);
		
	}
	
	// methods
	void addCar(Car c){
		System.out.println("add car ");
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual = false;
		
		if(obj != null){
			boolean nameIsEqual = this.getName().equals(((Part)obj).getName());
			boolean priceIsEqual = (this.getBuyPrice() == ((Part)obj).getBuyPrice()) && 
					(this.getSellPrice() == ((Part)obj).getSellPrice());

			if(nameIsEqual && priceIsEqual){
				isEqual = true;
			}
		}
		
		return isEqual;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		if(code >= MIN_CODE && code <= MAX_CODE){
			this.code = code;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name != null) ? name : "";
	}

	public int getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(int buyPrice) {
		this.buyPrice = (buyPrice >= 0) ? buyPrice : 0;
	}

	public int getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(int sellPrice) {
		this.sellPrice = (sellPrice >= 0) ? sellPrice : 0;
	}

	public Car[] getCars() {
		return Arrays.copyOf(cars, cars.length);
	}

	public void setCars(Car[] cars) {
		this.cars = Arrays.copyOf(cars, cars.length);
	}
	
	
	
	
}
