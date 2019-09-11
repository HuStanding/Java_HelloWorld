package 容器;

import java.util.Map;
import java.util.TreeMap;

/**
 * treemap的使用，排序树
 * @author huzhu
 * @date 2019-04-29 20:14
 */
public class TreeMapTest {
    public static void main(String[] args) {
        Map<Integer,String> treemap = new TreeMap();
        treemap.put(9,"a");
        treemap.put(4,"b");
        treemap.put(19,"c");

        for(Integer key : treemap.keySet()){
            System.out.println(key + "-" + treemap.get(key));
        }

        Map<Emp,String> treemap2 = new TreeMap<>();
        treemap2.put(new Emp(1001,"huzhu",3000),"a");
        treemap2.put(new Emp(1002,"hz",8000),"b");
        treemap2.put(new Emp(1003,"elvan",2000),"c");
        treemap2.put(new Emp(1005,"haha",2000),"c");

        for(Emp key : treemap2.keySet()){
            System.out.println(key + "-" + treemap2.get(key));
        }

    }
}


class Emp implements Comparable<Emp>{
    int id;
    String name;
    double saraly;

    public Emp(int id, String name, double saraly) {
        this.id = id;
        this.name = name;
        this.saraly = saraly;
    }

    @Override
    public int compareTo(Emp o){
        if(this.saraly > o.saraly){
            return 1;
        }else if(this.saraly < o.saraly){
            return -1;
        }else{
            if(this.id > o.id){
                return 1;
            }else if(this.id < o.id){
                return -1;
            }else{
                return 0;
            }
        }
    }

    @Override
    public String toString(){
        return "id=" + id + ",name=" + name + ",salary = " + saraly;
    }

}