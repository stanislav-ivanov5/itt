package lesson20_zadachi_avtochasti;

public class Car {

	private String model;
	private String maker;
	private int year;
	private Manufacturer ma;
	
	private Part[] parts;
	
	public Car(String model, String maker, int year){
		setMaker(maker);
		setModel(model);
		setYear(year);
	}
	
	void addPart(Part p){
		if(p != null){
			
			System.out.println("add part");			
		}
	}
	
	public String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = (model != null) ? model : "";

		
//		if (model == null) {
//			throw new IllegalArgumentException("Model parameter should not be null");
//		}
	}
	
	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = (maker != null) ? maker : "";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = (year >= 1950 && year <= 2016) ? year : 2000;
	}
	
	
}
