package timeInterval;

import java.util.*;

public class ConsoleTimeIntervalSource implements TimeIntervalSource {
	/**
	 * Initializing input variables.
	 */
	private Scanner input;
	private Integer numIntervals; // The user is asked for number of intervals
	private Integer start;
	private Integer end;

	/**
	 * This ArrayList stores all TimeInterval bounds - (start, end)
	 */
	protected static List<TimeInterval> list = new ArrayList<TimeInterval>();
	
	public ConsoleTimeIntervalSource() {
		// constructor
	}

	public List<TimeInterval> getList(){
		return list;
	}
	
	/**
	 * Override the getIntervals() method from TimeIntervalSource interface
	 */
	@Override
	public List<TimeInterval> getIntervals() {
		System.out.println("Interval number? ");
		input = new Scanner(System.in);

		/**
		 * Catch NullPointerException
		 */
		try {
			numIntervals = input.nextInt();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		// user input for TimeInterval<start, end>
		try {
			for (int i = 0; i < numIntervals; i++) {
				System.out.println("Enter start, end: ");
				start = input.nextInt();
				end = input.nextInt();

				// check if start < end
				if (end < start) {
					System.out.println(" ** start < end ** ");
					i--;
					continue;
				} else {
					list.add(new TimeInterval(start, end));
					// add every user input
					// for "start" and "end" to the ArrayList
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
	
	//Print values of ArrayList
	public void printFunction() {
		for (TimeInterval values : list) {
			System.out.println(values.getStart() + ", " + values.getEnd());
		}
	}
}
