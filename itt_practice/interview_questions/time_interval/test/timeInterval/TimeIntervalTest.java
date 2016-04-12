/**
 * 
 */
package timeInterval;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Stanislav Ivanov
 *
 */
public class TimeIntervalTest {

	/**
	 * Test method for {@link timeInterval.TimeInterval#getStart()}.
	 */
	@Test
	public void testGetStart() {
		TimeInterval test = new TimeInterval(3, 7);
		assertSame(3, test.getStart());
	}

}
