package 常用类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的互相转换
 * @author huzhu
 * @date 2019-04-07 21:47
 */
public class DateFormatTest {
    public static void main(String[] args) throws ParseException {

        /*按照对应的格式进行转换*/
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str = df.format(new Date());
        System.out.println(str);

        /*吧字符串转换为对应格式的时间对象*/
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = df2.parse("1999-2-12 14:23:45");
        System.out.println(date);

        /*测试其他的格式字符*/
        DateFormat df3 = new SimpleDateFormat("D");//当年的第几天
        String date3 = df3.format(new Date());
        System.out.println(date3);
    }
}
