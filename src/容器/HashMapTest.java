package 容器;

/**
 * 自定义hashmap
 * @author huzhu
 * @date 2019-04-24 10:04
 */
public class HashMapTest<K,V> {
    Node2[] table; //位桶
    int size;

    public HashMapTest() {
        table = new Node2[16];//2的整数幂
    }

    public V get(K key){
        int hash = myHash(key.hashCode(),table.length);
        V value = null;
        if(table[hash] != null) {
            Node2 temp = table[hash];
            while(temp != null) {
                if(temp.key.equals(key)) {
                    //知道对应的键值对象
                    value = (V)temp.value;
                    break;
                }else{
                    temp = temp.next;
                }
            }
        }
        return value;
    }

    public void put(K key, V value) {
        //需要考虑数组扩容的问题
        Node2 newNode = new Node2();
        newNode.hash = myHash(key.hashCode(),table.length);
        newNode.key = key;
        newNode.value = value;
        newNode.next = null;

        Node2 temp = table[newNode.hash];
        Node2 iterLast = null;//正在遍历的最后一个元素
        boolean keyRepeat = false;

        if(temp == null) {
            table[newNode.hash] = newNode;
            size++;
        } else {
            //遍历对应的链表
            while(temp != null) {
                //判断key如果重复，则覆盖
                if(temp.key.equals(key)){
                    System.out.println("key重复");
                    keyRepeat = true;
                    temp.value = value;
                    break;
                }else{
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if(!keyRepeat) {
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public static int myHash(int v,int length) {
        System.out.println(v & (length - 1));
        return v & (length - 1);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for(int i = 0; i < table.length;i++){
            Node2 temp = table[i];
            while(temp != null){
                sb.append(temp.key + ":" + temp.value + ",");
                temp = temp.next;
            }
        }
        sb.setCharAt(sb.length() - 1,'}');
        return sb.toString();
    }

    public static void main(String[] args) {
        HashMapTest<Integer,String> m = new HashMapTest();
        m.put(1001,"a");
        m.put(1002,"b");
        m.put(1003,"c");
        m.put(1002,"d");
        m.put(53,"e");
        m.put(69,"f");
        m.put(85,"g");
        System.out.println(m);
        System.out.println(m.get(1001));
//        for(int i = 10; i < 100;i++){
//            System.out.println(myHash(i,16));
//        }
    }
}


class Node2<K,V> {
    int hash;
    K key;
    V value;
    Node2 next;
}