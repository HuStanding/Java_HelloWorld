package 注解.自定义注解;

import 注解.自定义注解.SField;
import 注解.自定义注解.STable;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 使用反射读取注解的信息，模拟处理注解信息的流程
 * @author huzhu
 * @date 2019-06-06 15:57
 */
public class Demo {
    public static void main(String[] args) {
        try {
            //获取类的所有注解
            Class clazz = Class.forName("注解.自定义注解.Student");
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }
            //获得类的某一个注解
            STable table = (STable) clazz.getAnnotation(STable.class);
            System.out.println(table.value());

            //获得属性的注解
            Field filed = clazz.getDeclaredField("name");
            SField sField = filed.getAnnotation(SField.class);
            System.out.println(sField.columnName() + "-->" + sField.type() + "-->" + sField.length());

            //根据表名、字段等信息拼出DDL语句，使用JDBC执行SQL
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
