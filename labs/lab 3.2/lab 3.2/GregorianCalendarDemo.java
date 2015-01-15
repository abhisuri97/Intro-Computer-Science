
/**
 * Write a description of class GregorianCalendarDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class GregorianCalendarDemo
{
   public static void year(int year) {
       GregorianCalendar cal = (GregorianCalendar) GregorianCalendar.getInstance();
       boolean isLeapYear = cal.isLeapYear(year);
       System.out.println("Is leap year: " + isLeapYear);
    }
}
