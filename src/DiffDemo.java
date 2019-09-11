import java.util.Date;

public class DiffDemo {
    public static void main(String[] args) {
        try{
            long start = System.currentTimeMillis();
            System.out.println(new Date());
            Thread.sleep(1000 * 3);
            System.out.println(new Date());
            long end = System.currentTimeMillis();
            long diff = end - start;
            System.out.println(diff);
        }catch (Exception e){
            System.out.println("Get an exception!");
        }
    }
}
