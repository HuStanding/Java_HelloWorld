import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

    enum FreshJuiceSize {SMALL,MEDIUM,LARGE};

    public static int a = 0;

    Main(){
    }

    public void count(){
        a++;
    }

    private String format;

    public String getFormat() {
        return this.format;
    }
    public void setFormat(String format) {
        this.format = format;
    }




    public static void main(String[] args){
        System.out.println("Hello World!");
        Main newObj = new Main();
        newObj.count();
        Main newObj2 = new Main();
        newObj2.count();
        FreshJuiceSize  f = FreshJuiceSize.SMALL;
        System.out.println(f);
        System.out.println(a);

        System.out.println("\u0003");

        newObj.getFormat();

        Math.max(1,2);

        System.out.println(1 > 2);

        //二进制文件
        int A = 0b00111100;
        int B = 13;
        System.out.println(A & B);
        String name = "James";
        boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真

        System.out.println(result);

        //循环语句
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }

        //强循环
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            System.out.print( x );
            System.out.print(",");
        }

        //switch语句
        char grade = 'B';

        switch(grade)
        {
            case 'A' :
                System.out.println("优秀");
                break;
            case 'B' :
            case 'C' :
                System.out.println("良好");

            case 'D' :
                System.out.println("及格");
            case 'F' :
                System.out.println("你需要再努力努力");
                break;
            default :
                //System.out.println("未知等级");
        }
        System.out.println("你的等级是 " + grade);
        System.out.println(Math.sin(0));


        //String类
        char[] a = {'0','1','2','3'};
        String digit = new String(a);
        System.out.println(digit+digit.length());
        String b = "jajaj";
        System.out.println(digit.concat(b));

        StringBuffer c = new StringBuffer("huzhu");
        c.append("111");
        System.out.println(c);



        int[] array = {1,2,3,8,9,0,12};
        Arrays.sort(array);

        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(ft.format(date));

        System.out.printf("HH:MM:SS PM格式（12时制）：%tT%n",date);

    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] reverse(int[] list) {
        int[] result = new int[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}

