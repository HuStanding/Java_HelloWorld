package 数组;

import java.util.Arrays;

/**
 * 二维数组的使用
 * @author huzhu
 * @date 2019-04-07 15:32
 */
public class ArraysTest5 {
    public static void main(String[] args) {
        test02();

    }

    /*基本使用*/
    public static void test01() {
        int[][] a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[]{1,2,3};
    }

    /*数组存储表格数据*/
    public static void test02(){
        Object[] a1 = {1001,"hz",18,"学生","1995-03-13"};
        Object[] a2 = {1002,"huzi",13,"教师","1996-03-13"};
        Object[] a3 = {1003,"xiaohuzi",28,"教授","1993-03-13"};

        Object[][] emps = new Object[3][];
        emps[0] = a1;
        emps[1] = a2;
        emps[2] = a3;

        System.out.println(Arrays.toString(emps[0]));
        System.out.println(Arrays.toString(emps[1]));
        System.out.println(Arrays.toString(emps[2]));

    }
}
