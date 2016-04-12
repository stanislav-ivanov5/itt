package lesson21_date_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

	public static void main(String[] args) {
		
		// output using Period class from Java 8 
		
		
		LocalDate date = LocalDate.now();
		Period fiveDays = Period.ofDays(5);
	
		System.out.println(date.plus(fiveDays));
	}
}
