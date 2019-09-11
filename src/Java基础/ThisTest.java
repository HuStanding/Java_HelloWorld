package Java基础;

/**
 * @author huzhu
 * @date created in 2019-03-16 21:57
 * @explaination
 */
public class ThisTest {
    int a, b, c;

    ThisTest(int a,int b){
        this.a = a;
        this.b = b;
        System.out.println("constructor1");
    }

    ThisTest(int a,int b,int c){
        this(a,b);   //通过this调用构造器,必须放在第一句
        this.c = c;
        System.out.println("constructor2");

    }

    void sing(){

    }

    void eat(){
        this.sing();
    }

    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest(1,2,3);
        thisTest.eat();
    }
}
