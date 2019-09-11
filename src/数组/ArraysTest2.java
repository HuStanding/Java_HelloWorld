package 数组;

/**
 * @author huzhu
 * @date 2019-03-30 16:17
 */
public class ArraysTest2 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3};
        User[] users = {new User(1001,"huzhu"),
                        new User(1002,"huzhu2")};

        //默认初始化
        int[] b = new int[2];//默认值0


        //动态初始化
        int[] a1 = new int[2];//动态初始化数组，先分配空间；
        a1[0]=1;//给数组元素赋值；
        a1[1]=2;//给数组元素赋值；
    }
}
