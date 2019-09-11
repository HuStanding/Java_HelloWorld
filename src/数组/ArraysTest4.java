package 数组;

import java.util.Arrays;

/**
 * Arrays的使用
 * @author huzhu
 * @date 2019-04-07 15:27
 */
public class ArraysTest4 {
    public static void main(String[] args) {
        int[] a = {140,20,30};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,30));
    }

}
