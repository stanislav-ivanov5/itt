package itt_l6_constructors;

public class Computer {

	private static final int MIN_FREE_MEMORY = 0;
	private static final int DEFAULT_FREE_MEMORY = 0;
	private static final int MAX_HDD_MEMORY = 2000;
	private static final int MIN_HDD_MEMORY = 0;
	private static final int DEFAULT_HDD_MEMORY = 0;
	private static final double MIN_PRICE = 0.0;
	private static final int DEFAULT_PRICE = 0;
	private static final int INITIAL_YEAR = 2000;
	private static final int CURR_YEAR = 2016;
	private static final int DEFAULT_YEAR = 2000;
	private static final String DEFAULT_OS = "os";
	
	private String operationSystem;
	private boolean isNotebook; 
	private int year;
	private double price;
	private double hardDiskMemory;
	private double freeMemory;
	
	public Computer(){
		setIsNotebook(false);
		setOperationSystem("Windows XP");
	}
	
	public Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem){
		setYear(year);
		setPrice(price);
		setIsNotebook(isNotebook);
		setHardDiskMemory(hardDiskMemory);
		setFreeMemory(freeMemory);
		setOperationSystem(operationSystem);
	}

	public int comparePrice(Computer c){
		if(this.getPrice() > c.getPrice()){
			return 1;
		}
		if(this.getPrice() < c.getPrice()){
			return -1;
		}
		return 0;
	}

	public boolean getIsNotebook(){
		return this.isNotebook;
	}
	
	public void setIsNotebook(boolean isNotebook){
		this.isNotebook = isNotebook;
	}

	public String getOpearationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String opearationSystem) {
		this.operationSystem =(opearationSystem != null) ? opearationSystem : DEFAULT_OS;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = (year > INITIAL_YEAR && year < CURR_YEAR) ? year : DEFAULT_YEAR;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = (price > MIN_PRICE) ? price : DEFAULT_PRICE;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		this.hardDiskMemory = (hardDiskMemory > MIN_HDD_MEMORY && hardDiskMemory < MAX_HDD_MEMORY) ? 
				hardDiskMemory : DEFAULT_HDD_MEMORY;
	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		this.freeMemory = (freeMemory >= MIN_FREE_MEMORY && freeMemory <= this.getHardDiskMemory()) ? 
				freeMemory : DEFAULT_FREE_MEMORY;
	}
}
