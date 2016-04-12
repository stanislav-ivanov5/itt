package timeInterval;

public class TimeInterval {

	/**
	 * The start of this TimeInterval
	 */
	private Integer start;
	/**
	 * The end of this TimeInterval
	 */
	private Integer end;

	/**
	 * Constructs a new TimeInterval with the given values.
	 * 
	 * @param start
	 *            the start element
	 * @param end
	 *            the end element
	 */
	public TimeInterval(Integer start, Integer end) {
		this.start = start;
		this.end = end;
	}

	/**
	 * Getter for start
	 * 
	 */
	public Integer getStart() {
		return start;
	}

	/**
	 * Getter for end
	 * 
	 */
	public Integer getEnd() {
		return end;
	}

}
