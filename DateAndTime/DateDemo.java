
import java.time.*;
import java.util.*;



/**
 * date representation --> as the long --> milliseconds-->1-jan-1970
 * java follows the starting calender year as 1900
 */
/**
 * DateDemo
 */
public class DateDemo {
    public static void main(String[] args) {
        //printing the currentmillisecond
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);// it gives you year from 1970
        //if you divide the currentmiliseconds/1000 get second if you divide /60 get a minute like that you get the year divide by standard individual
        System.out.println(Long.MAX_VALUE);

        // here all about date class
        Date d = new Date();

        System.out.println(d.getYear()+1900);

        //here all about calendar class
        //java followed gregorian calendar
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2023));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        //now lets look on timezone 
        //time is divide on zone zero hur goes on england --> that on right hand side that + head hrs or all left is - hr 
        // india is 5hr head that is called offset based on that offset various timezone defined like asia/kolkata that india followed i.e 5:30 hr 
       // from the set time zone you can set the timezone whichever you want 
        gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());
    }
    
}