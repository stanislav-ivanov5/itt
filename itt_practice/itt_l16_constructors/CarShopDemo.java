package itt_l16_constructors;

public class CarShopDemo {

	public static void main(String[] args) {
		
		CarShop shop = new CarShop(5);
		
		Car tata = new Car("Tata", false, "white");
		Car trabi = new Car("Trabant", false, "beige");
		Person buyer = new Person();
		
		shop.addCar(tata);
		shop.addCar(trabi);
		
		tata.changeOwner(buyer);
		
		System.out.println(shop.getNextCar());
		shop.sellNextCar(buyer);
		System.out.println(shop.getNextCar());
		
		shop.showAllCarsInShop();
	}
}
