package 注解.自带注解;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huzhu
 * @date 2019-06-05 22:46
 */
public class Demo {
    public static void main(String[] args) {
        test01();
    }

    @Override
    public String toString(){
        return "";
    }

    @Deprecated
    public static void test01(){

    }

    @SuppressWarnings("all")
    public static void test02(){
        List list = new ArrayList();
    }

    @Annotation01(studentName = "huzhu",age = 24)
    public void a(){

    }

    @Annotation02("b")
    public void b(){

    }
}
