package 容器;


import org.omg.CORBA.OBJ_ADAPTER;

/**
 * 自定义ArrayList
 * @author huzhu
 * @date 2019-04-12 22:16
 */
public class ArrayListTest<E> {
    private Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    public ArrayListTest(){
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public ArrayListTest(int capacity) {
        if(capacity < 0){
            throw new RuntimeException("容量不能为负数！");
        }else if (capacity == 0) {
            elementData = new Object[DEFAULT_CAPACITY];
        }else{
            elementData = new Object[capacity];
        }
    }

    public void add(E obj) {
        //扩容
        if(size == elementData.length){
            Object[] newArray = new Object[elementData.length + (elementData.length >> 1)];
            System.arraycopy(elementData,0,newArray,0,elementData.length);
            elementData = newArray;
        }
        elementData[size++] = obj;
    }

    public E get(int index) {
        checkRange(index);
        return (E)elementData[index];
    }

    public void set(E element, int index) {
        checkRange(index);
        elementData[index] = element;
    }

    public void checkRange(int index) {
        //合法范围[0,size)
        if(index < 0 || index >= size) {
            throw new RuntimeException("索引不合法:  " + index);
        }
    }

    public void remove(E element) {
        //挨个比较
        for(int i = 0; i < size ;i++){
            if(element.equals(get(i))){
                remove(i);
            }
        }
    }

    public void remove(int index) {
        checkRange(index);
        int numMoved = size - index - 1;
        if(numMoved > 0) {
            System.arraycopy(elementData,index + 1,elementData,index,numMoved);
        }
        elementData[--size] = null;
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        //[a,b,c]
        sb.append("[");
        for(int i = 0; i < size;i++) {
            sb.append(elementData[i] + ",");

        }
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }


    public static void main(String[] args) {
        ArrayListTest a1 = new ArrayListTest(0);
        for(int i = 0;i < 20;i++){
            a1.add("a" + i);
        }
        System.out.println(a1);
        a1.set("hu",10);
        a1.remove(10);
        a1.remove("a11");
        System.out.println(a1);

        System.out.println(a1.get(10));
    }
}
