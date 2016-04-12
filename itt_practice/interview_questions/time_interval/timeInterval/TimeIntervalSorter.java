package timeInterval;

import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Stanislav Ivanov
 * This class extends ConsoleTimeIntervalSource
 * Implements compare() method of Comparator
 * and sorts all intervals
 */
public class TimeIntervalSorter extends ConsoleTimeIntervalSource {

	public TimeIntervalSorter(TimeIntervalSource source) {
	}
	
	public TimeIntervalSorter() {	
	}
	
	/**
	 * Implements Comparator<TimeInterval> 
	 */
	public final static Comparator<TimeInterval> FIRST_LIST = new Comparator<TimeInterval>() {

		public int compare(TimeInterval t1, TimeInterval t2) {
			if (t1.getStart() < t2.getStart()) {
				return -1;
			} else if (t1.getStart() == t2.getStart()) {
				if (t1.getEnd() < t2.getEnd()) {
					return -1;
				} else if (t1.getEnd() == t2.getEnd()) {
					return 0;
				} else if (t1.getEnd() > t2.getEnd()) {
					return 1;
				}
			}
			return 1;
		}
	};

	//Sort and print sorted intervals
	public void sorter() {
		Collections.sort(list, FIRST_LIST);

		for (TimeInterval value : list) {
			System.out.println(value.getStart() + ", " + value.getEnd());
		}
	}
}
