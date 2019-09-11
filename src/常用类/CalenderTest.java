package 常用类;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author huzhu
 * @date 2019-04-11 10:25
 */
public class CalenderTest {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2019,2,3,10,22,34);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(month);
        System.out.println(weekday);

        Calendar calendar2 = new GregorianCalendar();
        calendar2.set(Calendar.YEAR,9012);
        System.out.println(calendar2.get(Calendar.YEAR));
        System.out.println(calendar2);

        Calendar calendar3 = new GregorianCalendar();
        calendar3.add(Calendar.DATE,100);
        System.out.println(calendar3);

        Date d4 = calendar3.getTime();
        Calendar calendar4 = new GregorianCalendar();
        calendar4.setTime(new Date());

        printCalender(calendar4);
    }


    public static void printCalender(Calendar c){
        /*print:2019-4-11 11:11:11*/
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DAY_OF_MONTH);

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
        String[] week = {"日","一","二","三","四","五","六"};
        String dayOfWeek2  =week[dayOfWeek];

        int hour = c.get(Calendar.HOUR);
        int munite = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        System.out.println(year + "-" + month + "-" + date + " "
                            + hour + ":" + munite + ":" + second + " " + "周" + dayOfWeek2);
    }
}
