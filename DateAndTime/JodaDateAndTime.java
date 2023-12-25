import java.time.LocalDate;

public class JodaDateAndTime {
    public static void main(String[] args) {
        /**
         * why new api need ?
         * ans - So, here 1. date is store in the form of millisecond & it was calculated from 1 jan 1970
         * 2. It store the date & time both 
         * 3. it is mutable means you set date, time & etc;
         * So, in new api given below that class provide the date & time sperately & this class represent the time in the form second & nanoseconds
         * this classe are immutable but whenever you are changing you will get a new object of type localdate
         * Local Date
         * Local Time
         * LocalDateAndTime
         */
        LocalDate dt = LocalDate.now();
        System.out.println(dt);
    }
}
