/******************************************************************************
 *  Compilation:  javac DateFormat.java
 *  Execution:    java DateFormat
 *
 *  Create and print dates by specifying the format.
 *	
 *  % java DateFormat
 *  Current date: 
 *	2018-08-30 14:22:12 CST
 *	Parsed date: 
 *	Thu Aug 30 14:07:36 CST 2018
 *  
 ******************************************************************************/

import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class DateFormat {
	public static void main(String[] args) throws ParseException{
		// Print current local date.		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss z");
		System.out.println("Current date: ");
		System.out.println(formatter.format(date));

		// Parse and print a date string.
		String dateString = "2018-08-30 14:07:36 CST";
		// Add time zone for the string without timezone 
		// formatter.setTimeZone(TimeZone.getTimeZone("PST"));
		Date parsedDate = formatter.parse(dateString);
		System.out.println("Parsed date: ");
		//System.out.println(formatter.format(parsedDate));
		System.out.println(parsedDate);
	}
}