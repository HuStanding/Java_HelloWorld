package 注解.自带注解;

import jdk.nashorn.internal.ir.annotations.Reference;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author huzhu
 * @date 2019-06-06 10:25
 */
@Target(value= ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Annotation01 {
    String studentName() default "";
    int age() default 0;
    String[] schools() default {"华中科技大学","中国地质大学（武汉）"};
}
