import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
       //next();
       //nextLine();
       //nextNumber();
        multiNumber();
    }

    public static void next(){
        Scanner scan = new Scanner(System.in);
        System.out.println("next方式接收：");
        if(scan.hasNext()){
            String str = scan.next();
            System.out.println("输入的数据为：" + str);
        }
    }

    public static void nextLine(){
        Scanner scan = new Scanner(System.in);
        System.out.println("nextline方式接收：");
        if(scan.hasNextLine()){
            String str = scan.nextLine();
            System.out.println("输入的数据为：" + str);
        }
    }

    public static void nextNumber(){
        Scanner scan = new Scanner(System.in);
        int i = 0;
        float f = 0.0f;
        System.out.println("输入整数：");
        //判断是否输入了整数
        if(scan.hasNextInt()){
            i = scan.nextInt();
            System.out.println("整型数据：" + i);
        }else{
            System.out.println("输入的不是整数！");
        }

        System.out.println("请输入小数：");
        //判断是否输入了小数
        if(scan.hasNextFloat()){
            f = scan.nextFloat();
            System.out.println("小数数据：" + f);
        }else{
            System.out.println("输入的不是小数！");
        }
    }

    public static void multiNumber(){
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        //通过输入非数字结束输入
        while(scan.hasNextDouble()){
            double tmp = scan.nextDouble();
            m += 1;
            sum += tmp;
        }

        System.out.println("数据个数为：" + m);
        System.out.println("数据的和为：" + sum);
        scan.close();
    }
}
