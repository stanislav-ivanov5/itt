/**
 * 
 */
package timeInterval;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

/**
 * @author Stanislav Ivanov
 *
 */
public class ConsoleTimeIntervalSourceTest {

	/**
	 * Test method for {@link timeInterval.ConsoleTimeIntervalSource#getIntervals()}.
	 */
	@Test
	public void testGetIntervals() {
		
		TimeIntervalSource src = new TimeIntervalSource() {
			
			@Override
			public List<TimeInterval> getIntervals() {
				new TimeInterval(null, null);
				return null;
			}
		};
		Assert.assertEquals(null, src.getIntervals());
	}

}
