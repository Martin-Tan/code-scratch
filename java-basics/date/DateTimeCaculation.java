/******************************************************************************
 *  Compilation:  javac DateTimeCaculation.java
 *  Execution:    java DateTimeCaculation
 *
 *  Parse and compair dates by using the new feature of Java 8
 *
 *  % java DateTimeCaculation
 *  Date/time creation: tenthFeb2014: 2014-02-10
 *  Date/time creation: 2018-08-30 14:07:36: 2018-09-02T14:07:36
 *  Formated date/time: 2018-08-30 14:07:36: 2018-08-30 14:07:36
 *  38'' is after 37'':true
 *
 ******************************************************************************/

import java.time.LocalDate;
import java.time.Month;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Both LocalDate and LocalDateTime don't have timezone.
class DateTimeCaculation {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // Create a new date instance
        // 2014-02-10
        LocalDate tenthFeb2014 = LocalDate.of(2014, Month.FEBRUARY, 10);
        System.out.println("Date/time creation: tenthFeb2014: " + tenthFeb2014);

        // Parse date with format
        String dateString = "2018-08-30 14:07:36";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);

        // A char T will be added between date and time.
        // date/time creation: 2018-08-30 14:07:36: 2018-09-02T14:07:36
        System.out.println("Date/time creation: 2018-08-30 14:07:36: " + date.plusDays(3));
        System.out.println("Formated date/time: 2018-08-30 14:07:36: " + date.format(formatter));

        // Compare two dates.
        String dateStringAfter = "2018-08-30 14:07:37";
        LocalDateTime dateAfter = LocalDateTime.parse(dateStringAfter, formatter);
        System.out.println("38'' is after 37'':" + dateAfter.isAfter(date));
    }
}