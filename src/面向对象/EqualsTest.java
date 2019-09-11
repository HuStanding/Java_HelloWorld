package 面向对象;

import java.util.Objects;

/**
 * @author huzhu
 * @date created in 2019-03-29 22:48
 */
public class EqualsTest {

    public static void main(String[] args) {
        Object object;
        String str;

        User u1 = new User(1000, "胡著", "123456");
        User u2 = new User(1000, "小胡子", "123456");

        System.out.println(u1 == u2);//false
        System.out.println(u1.equals(u2));//true

        String str1 = new String("str");
        String str2 = new String("str");
        System.out.println(str1 == str2);//false
        System.out.println(str1.equals(str2));//true

    }
}


class User{
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        super();
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}