package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.time.LocalDateTime;
/**
 * Created with IntelliJ IDEA.
 * User: fujiitakahiro
 * Date: 2013/12/18
 * time: 0:38
 * To change this template use File | Settings | File Templates.
 */
public class CompareSimpleDateFormat {

    public static void main(String[] args) {
        //exampleCase1();
        exampleCase2();
    }

    public static void exampleCase1(){
        // Format for date class
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Calendar now = Calendar.getInstance();
        System.out.println(dateFormat.format(now.getTime()));

        now.add(Calendar.HOUR_OF_DAY,5);
        System.out.println(dateFormat.format(now.getTime())); //show Calendar instance is mutable.
    }

    public static void exampleCase2(){

        // Format for JSR-310
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(dateTimeFormatter));

        LocalDateTime localDateTime1 = localDateTime.plusHours(5);
        System.out.println(localDateTime.format(dateTimeFormatter)); //show LocalDateTime is immutable.
    }
}
