package time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/16
 * time: 21:50
 * To change this template use File | Settings | File Templates.
 */
public class DateAndTImeAPI {
    /**
     * ex1.)java.time
     */
    public static void main (String[] args){
        System.out.println("Let's touch Java8!!");
        //LocalDate();
        LocalTime();
    }

    /**
     * Practice of java.time.LocalDate
     */
    public static void LocalDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //YYYY-MM-DD
        System.out.println(localDate.getYear()); //YYYY
        System.out.println(localDate.getMonth());//
        System.out.println(localDate.getMonthValue()); //MM
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.plusDays(7).toString());
        System.out.println(localDate.minusMonths(1).toString());
        System.out.println(localDate.isLeapYear());
    }

    /**
     * Practice of java.time.LocalTime
     */
    public static void LocalTime(){
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(18,00); //18:00

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime.getHour());
        System.out.println(localTime.isAfter(localTime1));
    }

    /**
     * Practice of java.time.LocalDateTime
     */
    public static void LocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
