package lesson20_zadachi_avtochasti;

import java.util.Arrays;

public class AutoPartsStore {

	private int money;

	private int freePosition;
	private Part[] parts;

	
	public AutoPartsStore(){
		this.setMoney(500);
		this.parts = new Part[50];
		this.setFreePosition(parts.length);
	}
	
	void buyPart(Part p, Car c){
//		Part newPart = (Part) p.clone();
		if(p != null && c != null){
			
			if(p.getBuyPrice() <= this.getMoney()){
				this.addPart(p);
//				p.addCar(c);
//				c.addPart(p);
				this.setMoney(getMoney() - p.getBuyPrice());
				System.out.println("buy part ");
			}
		}
	}
	
	void sellPart(Part part){
		if(part != null){
			int price = part.getSellPrice();
			
			removePart(part);
			setMoney(getMoney() + price);
			
			System.out.println("sell part ");
		}
		System.out.println("part not sold");
	}
	
	private void addPart(Part p){
		if(freePosition > 0 && freePosition <= parts.length){
			parts[this.freePosition - 1] = p;
			System.out.println("add part ");
			setFreePosition(getFreePosition() + 1);
			return;
		}
		System.out.println("no part added");
	}
	
	void removePart(Part part){
		
		if(part != null){
			
//			int index = Arrays.binarySearch(parts, part);
			
			for (int i = 0; i < parts.length; i++) {
				Part p = parts[i];
				if(p.equals(part)){
					parts[i] = parts[parts.length-1];
					parts[parts.length-1] = null;
					freePosition--;
//					setFreePosition(getFreePosition() - 1); 
					break;
				}
			}
		}
	}
	
	
	void printParts(){
		if(parts != null){
			for(Part p : this.parts){
				if(p != null){
					System.out.println("part: " + p.getName() + "\nbuy price: " + p.getBuyPrice() 
							+ "\nsell price: " + p.getSellPrice() + "\ntotal money: " + this.getMoney());
				}
			}
		}
			
	}

	// get and set
	public int getFreePosition() {
		return freePosition;
	}
	
	public void setFreePosition(int freePosition) {
		if(freePosition >= 1 && freePosition <= parts.length){
			this.freePosition = freePosition;			
		} else {
			System.out.println("invalid position");			
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		if(money >= 0 ){
			this.money = money;
		}
	}
}
