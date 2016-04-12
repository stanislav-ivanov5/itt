package lesson20_date_time;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

class DateDemo {


	public DateDemo(){
		
	}
	
	static int ab;
	
	static public void main(String[] args) {
		int a;
		
		System.out.println(ab);
		
		
		@SuppressWarnings("deprecation")
		Date today = new Date(2016, 1, 13);
		System.out.println(today);
		
		Date todya = new Date(55555444);
		System.out.println(todya);
		Calendar date = Calendar.getInstance();
		System.out.println(date.getTime());
		
		LocalDate dnes = LocalDate.now();
		System.out.println(dnes);
		System.out.println(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		
		Period period = Period.ofDays(365);
		
	}
}
