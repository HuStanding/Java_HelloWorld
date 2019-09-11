package 容器;

import java.util.*;

/**
 * 存储表格数据,ORM思想
 * @author huzhu
 * @date 2019-04-30 22:33
 */
public class StoreDataTest {
    public static void main(String[] args) {
        test02();
    }

    public static void test01(){
        Map<String,Object> map1 = new HashMap<>();
        map1.put("id",1001);
        map1.put("name","张三");
        map1.put("salary",20000);
        map1.put("date",2019);


        Map<String,Object> map2 = new HashMap<>();
        map2.put("id",1002);
        map2.put("name","李四");
        map2.put("salary",10000);
        map2.put("date",2020);

        Map<String,Object> map3 = new HashMap<>();
        map3.put("id",1003);
        map3.put("name","王五");
        map3.put("salary",9000);
        map3.put("date",2017);

        //遍历表格
        List<Map<String,Object>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        for(Map<String,Object> row : list){
            Set<String> keyset = row.keySet();
            for(String key : keyset){
                System.out.print(key + ":" + row.get(key) + "\t");
            }
            System.out.println();
        }
    }

    public static void test02(){
        User user1 = new User(1001,"张三",30000,"2019");
        User user2 = new User(1002,"李四",20000,"2020");
        User user3 = new User(1003,"王五",7000,"2017");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        for(User u :list){
            System.out.println(u);
        }

        Map<Integer,User> map = new HashMap<>();
        map.put(1001,user1);
        map.put(1002,user2);
        map.put(1003,user3);

        Set<Integer> keyset = map.keySet();
        for(Integer key : keyset){
            System.out.println(map.get(key));
        }
    }
}


class User{
    private int id;
    private String name;
    private double salary;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User(int id, String name, double salary, String date) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public User() {
    }

    @Override
    public String toString(){
        return "id=" + id + ",name="+name+",salary="+salary+",date="+date;
    }
}