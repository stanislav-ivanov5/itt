package test2_vinetki;

import java.time.LocalDate;
import java.time.Period;

public abstract class Vinetka {

	private static final int MONTH_FACTOR = 10;
	private static final int YEAR_FACTOR = 6;

	private LocalDate purchaseDate;
	private Period validityPeriod;

	private double price;
	private String color;
	boolean isExpired;

	public Vinetka(Period validityPeriod) {
		this.purchaseDate = LocalDate.now();
		this.validityPeriod = validityPeriod;
		isExpired = false;

		this.price = calculatePrice(this, validityPeriod);

	}
	

	public Vinetka(Period validityPeriod, String color) {
		this(validityPeriod);
		this.color = color;

	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		}
	}

	public String getColor() {
		return this.color;
	}

	public double calculatePrice(Vinetka vinetka, Period period) {
		if (period.getDays() == 1) {
			return calculateDailyPrice(vinetka);
		}
		if (period.getMonths() == 1) {
			return calculateMonthlyPrice(vinetka);
		}
		if (period.getYears() == 1) {
			return calculateYearlyPrice(vinetka);
		}
		return 0;
	}

	private double calculateDailyPrice(Vinetka vinetka) {
		if (vinetka != null) {
			if (vinetka instanceof CarVinetka) {
				return 5;
			}
			if (vinetka instanceof TruckVinetka) {
				return 7;
			}
			if (vinetka instanceof BusVinetka) {
				return 9;
			}
		}
		return 0;
	}

	private double calculateMonthlyPrice(Vinetka vinetka) {
		return calculateDailyPrice(vinetka) * MONTH_FACTOR;
	}

	private double calculateYearlyPrice(Vinetka vinetka) {
		return calculateMonthlyPrice(vinetka) * YEAR_FACTOR;
	}

	public void printProperties() {
		System.out.println(this.getClass() + "\t Price : " + this.getPrice() + "; Color : " + this.getColor()
				+ this.getValidityPeriod().toString());
	}

	public Period getValidityPeriod() {
		return this.validityPeriod;
	}

	public void setValidity(Period period) {
		this.validityPeriod = period;
	}

	@Override
	public boolean equals(Object obj) {
		return this.getPrice() == ((Vinetka) obj).getPrice();
	}

}
