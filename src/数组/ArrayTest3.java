package 数组;

/**
 * @author huzhu
 * @date 2019-04-06 22:55
 */
public class ArrayTest3 {
    public static void main(String[] args) {
//        basicCopy2();
        extendRange();
    }

    public static void basicCopy(){
        String[] s = {"阿里","尚学堂","京东","搜狐","网易"};
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,5);
        for (int i = 0; i < sBak.length; i++) {
            System.out.print(sBak[i]+ "\t");
        }
    }

    /*从数组中删除某个元素*/
    public static void basicCopy2(){
        String[] s = {"a","b","c","d","e"};
//        String[] sBak = new String[6];
        System.arraycopy(s,3,s,2,s.length - 3);
        s[s.length - 1] = null;
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+ " ");
        }

    }

    /*数组扩容*/
    public static void extendRange(){
        String[] s1 = {"aa","bb","cc"};
        String[] s2 = new String[s1.length + 10];
        System.arraycopy(s1,0,s2,0,s1.length);
        for (int i = 0; i < s2.length; i++) {
            System.out.print(s2[i]+ " ");
        }
    }
}
