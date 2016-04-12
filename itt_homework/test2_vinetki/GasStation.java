package test2_vinetki;

import java.time.Period;
import java.util.Arrays;

// singleton GasStation class
public class GasStation {

//	private static final int INITIAL_NUMS_VINETKI = 10000;
	private static final int INITIAL_NUMS_VINETKI = 100;

	private static GasStation gasStation = null;
	private static double dailyTurnover;
	private static Vinetka[] vinetkiForSale;

	private static int lastIndex; // use it for indexing the last null member of
							// vinetkiForSale[]

	private int[] dailies;
	private int[] monthlies;
	private int[] yearlies;

	private GasStation() {
		vinetkiForSale = new Vinetka[INITIAL_NUMS_VINETKI];
		generateVinetki();
		dailyTurnover = 0;
		lastIndex = vinetkiForSale.length - 1;
	}

	public static GasStation getGasStation() {
		if (GasStation.gasStation == null) {
			gasStation = new GasStation();
		}
		return GasStation.gasStation;
	}

	public static Vinetka sellVinetka(Vinetka vinetka) {
		if (vinetka != null) {

			for (int index = 0; index <= GasStation.lastIndex; index++) {
				if (vinetka.equals(vinetkiForSale[index])) {

					GasStation.dailyTurnover += vinetkiForSale[index].getPrice();

					Vinetka tempVinetka = vinetkiForSale[index];
					vinetkiForSale[index] = vinetkiForSale[lastIndex];
					vinetkiForSale[lastIndex] = null;

					lastIndex -= 1;
					return tempVinetka;
				}
			}
		}
		return null;
	}

	public Vinetka[] getVinetki() {
		return Arrays.copyOf(this.vinetkiForSale, vinetkiForSale.length);
	}

	private void generateVinetki() {
		int randomVinetkaPeriod = (int) (Math.random() * (3 - 1)) + 1;
		int vehicleMatcher = (int) (Math.random() * (3 - 1)) + 1;

		for (int index1 = 0; index1 < vinetkiForSale.length; index1++) {

			vehicleMatcher = (int) ((Math.random() * (3 - 0)) + 1);

			if (vehicleMatcher == 1) {
				vinetkiForSale[index1] = new CarVinetka(Period.ofDays(1));
			}
			if (vehicleMatcher == 2) {
				vinetkiForSale[index1] = new TruckVinetka(Period.ofDays(1));
			}
			if (vehicleMatcher == 3) {
				vinetkiForSale[index1] = new BusVinetka(Period.ofDays(1));
			}
		}

		for (int index2 = 0; index2 < vinetkiForSale.length; index2++) {
			randomVinetkaPeriod = (int) ((Math.random() * (3 - 1)) + 1);

			Vinetka vinetka = vinetkiForSale[index2];

			if (randomVinetkaPeriod == 1) {
				vinetka.setValidity(Period.ofDays(1));
			}
			if (randomVinetkaPeriod == 2) {
				vinetka.setValidity(Period.ofMonths(1));
			}
			if (randomVinetkaPeriod == 3) {
				vinetka.setValidity(Period.ofYears(1));
			}
			double price = vinetka.calculatePrice(vinetka, vinetka.getValidityPeriod());
			
			vinetka.setPrice(price);

		}

	}

	private int[] countSort(int[] arrToCountIn, int startPrice, int middlePrice, int endPrice) {

		arrToCountIn = new int[endPrice + 1];

		// store the num of elements by price
		for (int index = 0; index < vinetkiForSale.length; index++) {

			if (vinetkiForSale[index].getPrice() == startPrice) {
				arrToCountIn[startPrice]++;
			}
			if (vinetkiForSale[index].getPrice() == middlePrice) {
				arrToCountIn[middlePrice]++;
			}
			if (vinetkiForSale[index].getPrice() == endPrice) {
				arrToCountIn[endPrice]++;
			}
		}
		return arrToCountIn;
	}

}
