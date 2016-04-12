package lesson25_threads_horses;

import java.util.ArrayList;
import java.util.List;

public class HorseDemo {


	public static void main(String[] args) {
		
		Horse kon = getHorse();
		
		List<Thread> horses = new ArrayList<Thread>();
		
		ThreadGroup regularHorses = new ThreadGroup("regular horses");
		
		for(int hors = 1; hors <= 10; hors++){
			Horse horse = null;
			Thread horseT = null;
			if(Math.random() > 0.5){
				horse = new Horse();
				horseT = new Thread(regularHorses, horse, "Horse num" + horse);
			}
			else {
				horse = new LameHorse();
				horseT = new Thread(horse, "Lame horse num" + horse);
			}
			horses.add(horseT);
		}
		
		for (Thread horseT : horses) {
			horseT.start();
		}
		
		Thread audienceT = new Thread(new Audience(regularHorses));
		audienceT.setDaemon(true);
		audienceT.start();
		
	}
	
	private static Horse getHorse() {
		return null;
	} 
}
