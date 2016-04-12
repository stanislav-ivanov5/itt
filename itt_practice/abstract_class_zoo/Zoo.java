package abstractClassZoo;

public class Zoo {

	private Animal[] animals;
	
	public Zoo(int cells){
		animals = new Animal[cells];
	}
	
	public void addAnimal(Animal an){
		for(int i = 0; i < animals.length; i++){
			if(animals[i] == null){
				animals[i] = an;
				return;
			}
		}
		System.out.println("no free cells");
	}
	
	void printZooInfor(){
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] != null){
				System.out.println(animals[i].toString());
			}
		}
	}
	
	public Animal[] getAnimals(){
		return this.animals;
	}
	
	@Override
	public String toString(){
		
		return animals.getClass().getName();
	}
}
