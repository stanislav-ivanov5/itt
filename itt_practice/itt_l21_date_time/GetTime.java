package lesson21_date_time;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class GetTime {

	// get the date and time and use DateFormat class
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("Day: " + Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		System.out.println("Month : " + Calendar.getInstance().get(Calendar.MONTH));
		System.out.println("Day of week: " + Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
		System.out.println("Year: " + Calendar.getInstance().get(Calendar.YEAR));
		
		System.out.printf("Readable date: %s-%s-%s	\n\n", cal.get(Calendar.DAY_OF_MONTH),
														cal.get(Calendar.MONTH),
														cal.get(Calendar.YEAR));
		
		
		Date now = new Date();
		String s = now.toString();
	
		System.out.println(s);
		System.out.println(DateFormat.getInstance().format(now));
	
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
	
	}
}
