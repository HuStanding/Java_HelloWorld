package 常用类;

import java.util.Date;
import java.util.Locale;

public class DateTest {
    public static void main(String args[]){
        Date date = new Date();
        //应该是用carlender
        Date date1 = new Date(2020,3,10);
        System.out.println(date1);
        //b的使用，月份简称
        String str = String.format(Locale.US,"英文月份简称：%tb",date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n",date);

        //B的使用，月份全称
        str = String.format(Locale.US,"英文月份全称：%tB",date);
        System.out.println(str);
        System.out.printf("本地月份全程：%tB%n",date);

        //a的使用，星期简称
        str = String.format(Locale.US,"英文星期的简称%ta",date);
        System.out.println(str);
        System.out.printf("本地星期简称：%ta%n",date);

    }
}
