package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author huzhu
 * @date 2019-04-11 11:12
 */
public class CalenderTest2 {
    public static void main(String[] args) throws ParseException {
        String str = "2019-4-10";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(str);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        calendar.set(Calendar.DATE, 1);
        int dow = calendar.get(Calendar.DAY_OF_WEEK); // week:1-7 日一二三四五六
        for (int i = 0; i < dow - 1; i++) {
            System.out.print("\t");
        }

        int maxDate = calendar.getActualMaximum(Calendar.DATE);
        // System.out.println("maxDate:"+maxDate);
        for (int i = 1; i <= maxDate; i++) {
            StringBuilder sb = new StringBuilder();
            if (calendar.get(Calendar.DATE) == day) {
                sb.append(calendar.get(Calendar.DATE) + "*\t");
            } else {
                sb.append(calendar.get(Calendar.DATE) + "\t");
            }
            System.out.print(sb);
            // System.out.print(c.get(Calendar.DATE)+
            //                ((c.get(Calendar.DATE)==day)?"*":"")+"\t");

            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.print("\n");
            }
            calendar.add(Calendar.DATE, 1);
        }
    }
}
