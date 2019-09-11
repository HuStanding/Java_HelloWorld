package String类;

/**
 * 字符串拼接
 * @author huzhu
 * @date 2019-04-07 21:21
 */
public class StringTest3 {
    public static void main(String[] args) {

        /*使用String字符串进行拼接*/
        long startTime1 = System.currentTimeMillis();//获取当前时间
        long memory1 = Runtime.getRuntime().freeMemory();
        String s = "";
        for(int i = 0;i < 10000;i++){
            s = s + i;
        }
        long endTime1 = System.currentTimeMillis();
        long memory2 = Runtime.getRuntime().freeMemory();
        System.out.println("String运行时间："+(endTime1-startTime1)+"ms");
        System.out.println("String运行内存："+(memory1-memory2));
        System.out.println(s);


        /*使用StringBUilder*/
        long startTime2 = System.currentTimeMillis();//获取当前时间
        long memory3 = Runtime.getRuntime().freeMemory();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < 10000;i++){
            sb.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        long memory4 = Runtime.getRuntime().freeMemory();
        System.out.println("String运行时间："+(endTime2-startTime2)+"ms");
        System.out.println("String运行内存："+(memory3-memory4));
        System.out.println(sb);
    }

}
