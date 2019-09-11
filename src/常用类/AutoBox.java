package 常用类;

/**
 * @author huzhu
 * @date 2019-04-07 17:25
 */
public class AutoBox {
    public static void main(String[] args) {
        Integer a = 234;//装箱，Integer a = Integer.valueOf(234);

        int b = a;  //拆箱 int b = a.intValue(a)

//        Integer c = null;
//        int d = c;


        //缓存[-128,127]之间的数字
        Integer in1 = -128;
        Integer in2 = -128;
        System.out.println(in1 == in2);//true 因为123在缓存范围内
        System.out.println(in1.equals(in2));//true
        Integer in3 = 1234;
        Integer in4 = 1234;
        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
        System.out.println(in3.equals(in4));//true

    }
}

