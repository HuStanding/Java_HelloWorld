package 容器;

import java.util.HashMap;

/**
 * 手动实现hashset
 * @author huzhu
 * @date 2019-04-29 22:33
 */
public class HashSetTest2 {
    HashMap map;

    private static final Object PRESENT = new Object();
    public HashSetTest2(){
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PRESENT);

    }

    public int size(){
        return map.size();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(Object key : map.keySet()){
            sb.append(key + ",");
        }
        sb.setCharAt(sb.length() - 1,']');
        return sb.toString();
    }
    public static void main(String[] args) {
        HashSetTest2 set = new HashSetTest2();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");

        System.out.println(set);
    }
}
