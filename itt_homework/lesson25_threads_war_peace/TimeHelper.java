package lesson25_threads_war_peace;

import java.time.Duration;
import java.time.LocalTime;

/**
 * 
 * @author stanislav5
 * TimeHelper class implements static printDuration utility method
 */
public class TimeHelper {

	static void printDuration(LocalTime startTime) {
		LocalTime endTime = LocalTime.now();
		Duration duration = Duration.between(startTime, endTime);
		System.out.println(duration.toMillis());
	}
}
