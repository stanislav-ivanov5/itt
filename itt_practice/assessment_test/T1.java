package assessmenttest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1 {

	public static void main(String[] args) {

		String s1 = "asdf";
		String s2 = "asdf".trim();
		
		System.out.println(s1 == s2);
		
		String[] bugs = {"d", "asdfasdf asd", "law5"};
		String[] alias = bugs;
		
		System.out.println(bugs.equals(alias));
		
		
		List<Integer> listt = new ArrayList<Integer>();
		listt.add(1);
		System.out.println(listt);

		System.out.println(Enumnum.AndSo);

		List<Integer> values = new ArrayList<Integer>();
		values.add(5);
		values.add(6);
		for (java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
			int value = i.next();
			System.out.println(value);
		}

		for (int value : values) {
			System.out.println(value);
		}
		
		int x = 5 * 4 % 3;
 
		System.out.println(x);
		
		List<String> list = Arrays.asList("5");
		System.out.println(list);
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		
		int numFish = 4;
//		String anotherFish = numFish + 1; // compile error
		
		
		String s = "Hello";
		String t = new String(s);
		if ("Hello".equals(s)) System.out.println("one");
		if (t == s) System.out.println("two");
		if (t.equals(s)) System.out.println("three");
		if ("Hello" == s) System.out.println("four");
		if ("Hello" == t) System.out.println("five");
		
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
		
		System.out.println(sb.charAt(3));
		
//		String s11 = "java";
//		StringBuilder s21 = new StringBuilder("java");
//		if (s11 == s21)		// DOES NOT COMPILE
//			System.out.print("1");
//		if (s11.equals(s21))
//			System.out.print("2");
		
		String numbers = "012345678";
		System.out.println(numbers.substring(7));
		
		String a = "";
		a += 2;
		a += 'c';
		a += false;     
		if ( a == "2cfalse") System.out.println("==");
		if ( a.equals("2cfalse")) System.out.println("equals");
		
		StringBuilder numberss = new StringBuilder("0123456789");
		numberss.delete(2,  8);
		numberss.append("-").insert(2, "+");
		System.out.println(numberss);
		
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two) 
		  System.out.println("A");
		else if (one.equals(two))
		  System.out.println("B");
		else 
		  System.out.println("C");
		
//		LocalDate date = LocalDate.of(2018, Month.APRIL, 40);   // RUNTIME EXCEPTION
//		System.out.println(date.getYear() + " " + date.getMonth() + " "
//		+ date.getDayOfMonth());
		
		LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(1);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));
	}
}
