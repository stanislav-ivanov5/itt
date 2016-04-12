package itt_l16_constructors;

public class Demo {

	public static void main(String[] args) {
		
		Car kola = new Car("UAZ", false, "green");
		Car kola2 = new Car("NIVA", false, "white");
		kola.setPrice(1500);
		kola2.setPrice(900);
		
		if(kola.isMoreExpensive(kola2)){
			System.out.println(" " + kola.getModel() + " is more expensive");
		}
		else {
			System.out.println(" " + kola.getModel() + " is less expensive or at the same price");
		}
		System.out.println(" compared to " + kola2.getModel());
		
		System.out.println(" " + kola.getModel() + " price for scrap:  " +  
				kola.calculatePriceForScrap(5));
		
		

		System.out.println("*******");
		System.out.println(kola.toString());
		
		Person plamen = new Person(25, "Plamen");
	}
}
