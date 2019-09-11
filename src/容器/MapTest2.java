package 容器;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huzhu
 * @date 2019-04-18 22:03
 */
public class MapTest2 {


    public static void main(String[] args) {
        Employee e1 = new Employee(1001,"胡著",50000);
        Employee e2 = new Employee(1002,"胡著2",50000);
        Employee e3 = new Employee(1003,"胡著3",50000);

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1001,e1);
        map.put(1004,e2);
        map.put(1003,e3);

        Employee emp = map.get(1001);
        System.out.println(emp.getName());
        System.out.println(map);
    }
}


class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "id:" + id + " name:" + name + " 薪水:" + salary;
    }

}
