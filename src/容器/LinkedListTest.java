package 容器;

/**
 * LinkedList自定义
 * @author huzhu
 * @date 2019-04-14 21:15
 */
public class LinkedListTest<E> {
    private Node first;
    private Node last;
    private int size;

    public void checkRange(int index) {
        if(index < 0 || index >= size) {
            throw new RuntimeException("索引不合法：" + index);
        }
    }

    public void add(E obj){
        Node node = new Node(obj);
        if(first == null) {
            first = node;
            last = node;
        } else {
            node.pre = last;
            node.next = null;
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public String toString() {
        Node temp = first;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while(temp != null) {
            sb.append(temp.element + ",");
            temp = temp.next;
        }
        sb.setCharAt(sb.length() - 1,']');
        return sb.toString();
    }

    public Node getNode(int index) {
        checkRange(index);
        Node temp = null;
        //位置在前面部分
        if(index <= (size >> 1)) {
            temp = first;
            for(int i = 0;i < index;i++){
                temp = temp.next;
            }
        }else {
            //后面部分
            temp = last;
            for(int i = size - 1;i > index;i--){
                temp = temp.pre;
            }
        }
        return temp;
    }

    public E get(int index){
        checkRange(index);
        if(index < 0 || index >= size) {
            throw new RuntimeException("索引不合法：" +index);
        }
        Node temp = getNode(index);
        return temp != null ? (E) temp.element : null;
    }


    public void remove(int index) {
        checkRange(index);
        Node temp = getNode(index);

        Node up = temp.pre;
        Node down = temp.next;
        if(up != null){
            up.next = down;
        }
        if(down != null){
            down.pre = up;
        }
        if(index == 0) {
            first = down;
        }
        if(index == size - 1){
            last = up;
        }
        size--;
    }

    public void add(int index, E obj) {
        if(index >= size + 1){
            throw new RuntimeException("索引不合法：" +index);
        }
        Node temp = getNode(index);
        Node newNode = new Node(obj);
        if(temp != null) {
            Node pre = temp.pre;
            //在头部插入
            if(pre == null) {
                Node preFirst = first;
                first = newNode;
                newNode.next = preFirst;
            }else {
                newNode.pre = pre;
                newNode.next = temp;
                pre.next = newNode;
                temp.pre = newNode;
            }
        }
        size++;
    }

    public static void main(String[] args) {
        LinkedListTest<String> list = new LinkedListTest();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(0);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.add(0,"h");//头部插入
        System.out.println(list);
        list.add(2,"x");//中间插入
        System.out.println(list);
    }
}


class Node{
    Node pre;
    Node next;
    Object element;

    public Node(Node pre, Node next, Object element) {
        super();
        this.pre = pre;
        this.next = next;
        this.element = element;
    }

    public Node(Object element) {
        super();
        this.element = element;
    }
}
