/******************************************************************************
 *  Compilation:  javac SpringSeason.java
 *  Execution:    java SpringSeason
 *  
 *  Check whether current day is in spring.
 * 
 *  % java SpringSeason
 *  Current date is 2018-04-22 20:46:39 CST
 *  Today is in spring season.
 *
 ******************************************************************************/

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class SpringSeason {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);

		Date dateOfToday = cal.getTime();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		System.out.println("Current date is " + dateFormat.format(dateOfToday));

		// Spring is between March 20 (m = 3, d =20) and June 21 (m = 6, d = 20).
		// Java month starts at 0 to 11, but the day of month starts at 1.
		if ( (month > 2 && day >= 20) || (month < 5 && day <= 21)) {
			System.out.println("Today is in spring season.");
		} else {
			System.out.println("Today is NOT in spring season.");
		}
	}
}